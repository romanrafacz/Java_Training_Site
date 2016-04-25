package com.lms.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lms.domain.Customer;
import com.lms.domain.MOrder;
import com.lms.domain.CustomerProfile;
import com.lms.service.CustomerProfileRepository;
import com.lms.service.CustomerRepository;
import com.lms.service.OrderRepository;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	private CustomerProfileRepository customerProfileRepository;
	@Autowired
	private OrderRepository orderRepository;
	
	@RequestMapping("/customers")
	public ModelAndView getCustomers(){
		return new ModelAndView("customer/customers", "customers", customerRepository.findAll() );
	}
	
	@RequestMapping(value="/customer/{id}", method=RequestMethod.GET)
	public ModelAndView getCustomerById(@PathVariable Integer id){
		Integer customer_id = id;
		Customer customer = customerRepository.findOne(customer_id);
		//CustomerProfile customer_profile = customerProfileRepository.findOne(customer_id);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("customer", customer);
		//Test variables
		//String email="erik@gmail.com";	
		//model.put("customer_profile", email);
		List<MOrder> ordery = orderRepository.findOrderByCustomer(customer_id);
		model.put("orders", ordery);
		return new ModelAndView("customer/customer", "model", model);
	}
	
	@RequestMapping(value="/customer/new", method=RequestMethod.GET)
	public String addCustomerPage(){
		return "customer/addCustomer";
	}
	
	@RequestMapping(value="/customer/add", method=RequestMethod.POST)
	public ModelAndView addCustomer(@RequestParam("customerName") String customerName, 
			@RequestParam("customerEmail") String customerEmail){
		//One attempt
		Integer customerId = 5;
		Customer customer = new Customer();
		customer.setName(customerName);
		customerRepository.saveAndFlush(customer);
		CustomerProfile customerProfile = new CustomerProfile(customerEmail);
		customerProfile.setProfileId(customer.getCustomerId());
		customerProfile.setEmail(customerEmail);
		customerProfile.setCustomer(customer.getCustomerId());
		customerProfileRepository.save(customerProfile);
		
		//Another attempt
		Customer customer2 = new Customer(customerName, new CustomerProfile(customerEmail));
		
		
		//String emy = "jim@gmail.com";
		//CustomerProfile customerProfile = new CustomerProfile(emy, customer2);
		//customerProfileRepository.save(customerProfile);
		
		//List<Customer> cust = new ArrayList<>();
		//cust.add(new Customer(customerName, new CustomerProfile(customerEmail)));
		//customerRepository.save(cust);
		return new ModelAndView("redirect:/customers");
	}
	

}
