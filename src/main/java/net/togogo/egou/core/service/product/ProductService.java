package net.togogo.egou.core.service.product;

import java.util.List;
import java.util.Map;

import net.togogo.egou.common.utils.PageController;
import net.togogo.egou.core.domain.product.Img;
import net.togogo.egou.core.domain.product.Product;


public interface ProductService {

	/**
	 * 条件查询，
	 * @param maps 若为null,表示查询全部
	 * @return
	 */
	List<?> findProductRecord(Map<String,Object> maps,PageController pageController);
	List<?> findBrandRecord(Map<String,Object> maps,PageController pageController);
	List<?> findTypeRecord(Map<String,Object> maps,PageController pageController);
	List<?> findFeatureRecord(Map<String,Object> maps,PageController pageController);

	/**
	 * 根据id查询数据
	 */
	public Product findByID(int id);

	/**
	 * 查询所有数据
	 */
	public List<Product> findAll();

	/**
	 * 添加商品和图片路径
	 * @param maps 
	 */
	void addProduct(Product product,Img img);
	
	/**
	 * 查找品牌名字
	 * @param pro
	 * @return
	 */
	String[] findbrandName();
	
	/*
	 * 查询总记录数
	 */
	long findTotalCount();
	
	String[] findFeatureName();
	String[] findTypeName();

}
