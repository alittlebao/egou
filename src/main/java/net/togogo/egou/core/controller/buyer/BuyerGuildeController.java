package net.togogo.egou.core.controller.buyer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BuyerGuildeController {

	@RequestMapping("/cache/product_index")
	public String productIndex(){
		System.out.println("***BuyerGuildeController's productIndex()****");
		return "product/product";
	}
}
