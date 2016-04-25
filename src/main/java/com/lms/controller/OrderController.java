package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lms.service.OrderRepository;

@Controller
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@RequestMapping("/orders")
	public ModelAndView getOrders(){
		return new ModelAndView("orders/orders","orders", orderRepository.findAll() );
	}
	
	@RequestMapping("/order/{id}")
	public ModelAndView getOrderById(@PathVariable Integer id){
		return new ModelAndView("orders/order", "order", orderRepository.findOne(id));
	}

}
