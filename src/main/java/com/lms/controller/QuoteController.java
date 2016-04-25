package com.lms.controller;

//Controller for REST API testing

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.lms.domain.Quote;

@Controller
public class QuoteController {
	
	@RequestMapping("/quotes")
	public ModelAndView getQuotes(){
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		return new ModelAndView("quote_page", "quotes", quote);
	}

}
