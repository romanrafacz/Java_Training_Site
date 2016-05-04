package com.lms.controller;

import org.apache.http.HttpHost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.lms.domain.ScheduleInfo;
import com.lms.utils.AuthHttpComponentsClientHttpRequestFactory;

@Controller
public class CourseController {
	
	final private String userName = "AC-029349";
	final private String password = "engie0Ye";
	final private String HttpHost = "https://academy.avnet.com/api/v2/courses";
	final private String host = "";
	
	
	final AuthHttpComponentsClientHttpRequestFactory requestFactory =
			new AuthHttpComponentsClientHttpRequestFactory(HttpHost, userName, password);
	final RestTemplate restTemplate = new RestTemplate(requestFactory);
	
	@RequestMapping("/courses")
	public ModelAndView getCourses(){
		ScheduleInfo scheduleInfo = restTemplate.getForObject("https://academy.avnet.com/api/v2/courses", ScheduleInfo.class);
		return new ModelAndView("schedule", "schedule", scheduleInfo);
	}
	

}
