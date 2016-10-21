package ProductTest;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.togogo.egou.common.utils.PageController;
import net.togogo.egou.core.domain.product.Img;
import net.togogo.egou.core.domain.product.Product;
import net.togogo.egou.core.service.product.ProductService;

public class ProductTest {

	private ApplicationContext context;
	private ProductService productService;

	@Before
	public void init() {
		context = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		productService = (ProductService) context.getBean("productService");
	}
	
	@Test
	public void testQuery(){
//		List<?> products = productService.findRecord(null);
//		for (Object product : products) {
//			System.out.println(product.toString());
//		}
//		System.out.println("一共有"+products.size()+"条记录");
		Product product = productService.findByID(266);
		System.out.println(product);
	}
	
	@Test
	public void testAdd(){
		Product p = new Product();
		p.setName("aaaaaaa");p.setType_id(2);p.setBrand_id(1);
		productService.addProduct(p,new Img());
		System.out.println("done");
	}
	
	/**
	 * 测试查询品牌名字
	 */
	@Test
	public void testfindBrandName(){
		
		String[] names = productService.findbrandName();
		for (String n : names) {
			System.out.println("name==>"+n);
		}
	}
	@SuppressWarnings("unchecked")
	@Test
	public void testFindRecord(){
		int i = (int) productService.findTotalCount();
		PageController page=new PageController(i, 1, 7);
		
		List<Product> findAll = (List<Product>) productService.findProductRecord(null, page);
		for(Product f:findAll){
			System.out.println(f);
		}
	}
	
	@Test
	public void testFindTatolCount(){
		System.out.println("总记录数"+productService.findTotalCount());
	}
}
