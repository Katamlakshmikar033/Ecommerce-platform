package springmvc_ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import springmvc_ecommerce.configuration.dao.Productdao;
import springmvc_ecommerce.configuration.dto.Product;


@Controller
public class ProductController {
     
	@Autowired
	Productdao productdao;
	
	@Autowired
	ModelAndView modelandview;
	
	
	@RequestMapping("/insert")
	@ResponseBody
	public String insertdata(@ModelAttribute Product product) {
		System.out.println("product");
		return productdao.save(product) ;
		
	}
	
	@RequestMapping("/fetchall")
	public ModelAndView fetchAll() {
		List<Product> list=productdao.fetchAll();
		 modelandview.addObject("key", list);
    	 modelandview.setViewName("/fetchall");
    	 return modelandview;
	}
	
	 @RequestMapping("/update")
     @ResponseBody
     public ModelAndView updatedata(@ModelAttribute Product product) {
    	 System.out.println(product);
    	 productdao.updatedata(product);
    	 
    		 return fetchAll();
    	 }
}
