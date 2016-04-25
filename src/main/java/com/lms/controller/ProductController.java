package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lms.service.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping("/product")
	public ModelAndView getProducts(){
		return new ModelAndView("product/products", "products", productRepository.findAll());
	}
	
	@RequestMapping(value="/product/{id}", method=RequestMethod.GET)
	public ModelAndView getProductById(@PathVariable Integer id){
		return new ModelAndView("product/product", "product", productRepository.findOne(id));
	}
	
	@RequestMapping(value="/product/new", method=RequestMethod.GET)
	public String addCustomerPage(){
		return "customer/addCustomer";
	}
	
	
	//@RequestMapping(value="/product/new" methods=Request.Method.)

}
