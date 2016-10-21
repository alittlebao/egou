package net.togogo.egou.core.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.togogo.egou.common.utils.Constants;
import net.togogo.egou.common.utils.PageController;
import net.togogo.egou.core.domain.product.Img;
import net.togogo.egou.core.domain.product.Product;
import net.togogo.egou.core.service.product.ProductService;

import org.apache.commons.io.FilenameUtils;
import org.aspectj.util.FileUtil;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@Controller
public class ProductController {

	@Resource
	private ProductService productService;

	@RequestMapping("/product/product_findAll")
	public String findAll() {
		List<Product> products = productService.findAll();
		for (Product product : products) {
			System.out.println(product);
		}
		// /WEB-INF/back_page/index.jsp
		// /WEB-INF/back_page/brand/list.jsp
		return "index";
	}

	// 图片上传
	private Client client = new Client();
	private WebResource webResource;

	@RequestMapping(value = "/upload/img_upload")
	public void uploadImg(
			@RequestParam(value = "pic", required = false) MultipartFile pic,
			HttpServletResponse response, HttpSession session) {

		// 1.将图片上传到另一个tomcat服务器
		System.out.println("****UploadController's uploadImg()****");
		// 生成文件名,
		String fileName = getFileName(pic);
		// 获得文件名称的后辍
		String ext = FilenameUtils.getExtension(pic.getOriginalFilename());
		String filePath = "upload/" + fileName + "." + ext;
		String imgUrl = Constants.IMG_URL + filePath;

		// 图片上传的路径
		webResource = client.resource(imgUrl);
		// 读本地文件

		try {
			// buf = FileUtil.readAsByteArray(new File("d:/aa.jpg"));
			byte[] imgBuf = FileUtil.readAsByteArray(pic.getInputStream());
			session.setAttribute("imgBuf", imgBuf);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// webResource.put(String.class, imgBuf);
		// System.out.println("图片上传完成");

		// 2.向客户端输出两个路径,以json的方式来输出
		JSONObject json = new JSONObject();
		json.put("filePath", filePath);
		json.put("imgUrl", imgUrl);

		response.setContentType("application/json;charset=utf-8");
		try {
			PrintWriter out = response.getWriter();
			out.println(json);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 生成文件名称,不包括后辍 根据系统时间来生成文件名称
	 * 
	 * @return
	 */
	private String getFileName(MultipartFile pic) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		String format = sdf.format(new Date()) + pic.getName();
		return format;
	}

	@RequestMapping(value = "/product/add")
	public String add(Product product, Img img, HttpSession session) {
		byte[] imgBuf = (byte[]) session.getAttribute("imgBuf");
		if (imgBuf != null && webResource != null) {
			webResource.put(String.class, imgBuf);
		}
		productService.addProduct(product, img);
		session.removeAttribute("imgBuf");
		return "product/list";
	}

	@RequestMapping(value = "/seller/productList")
	public String allProductByPage(HttpServletRequest request) {
		int totalCount = (int) productService.findTotalCount();
		HttpSession session = request.getSession();
		PageController pc = (PageController) session.getAttribute("pc");
		if (pc == null) {
			pc = new PageController(totalCount, 1);
		}
		return "";
	}

}
