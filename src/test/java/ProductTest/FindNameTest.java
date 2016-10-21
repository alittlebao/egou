package ProductTest;

import java.util.List;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.togogo.egou.core.service.product.ProductService;

public class FindNameTest {

	private ApplicationContext context;
	private ProductService productService;

	@Before
	public void init() {
		context = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		productService = (ProductService) context.getBean("productService");
	}
	
	@Test
	public void testFindName(){
		String[] featureNames = productService.findFeatureName();
		for (String f : featureNames) {
			System.out.println("==>"+f);
		}
	}
	@Test
	public void testBrandName(){
		String[] featureNames = productService.findbrandName();
		for (String f : featureNames) {
			System.out.println("==>"+f);
		}
	}
	@Test
	public void testTypeName(){
		String[] featureNames = productService.findTypeName();
		for (String f : featureNames) {
			System.out.println("==>"+f);
		}
	}
	
	@Test
	public void testFindRecord(){
		List<?> fs = productService.findBrandRecord(null, null);
		for(Object f:fs){
			System.out.println(f);
		}
		System.out.println("+++++++++++++++++++++++++++++");
		fs = productService.findTypeRecord(null, null);
		for(Object f:fs){
			System.out.println(f);
		}
		System.out.println("+++++++++++++++++++++++++++++");
		fs = productService.findFeatureRecord(null, null);
		for(Object f:fs){
			System.out.println(f);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		TreeSet a = new TreeSet();
	}
	
	
}
