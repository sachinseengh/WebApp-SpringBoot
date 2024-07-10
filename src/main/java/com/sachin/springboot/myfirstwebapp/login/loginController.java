package com.sachin.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	
	
	//for the url like http://localhost:8080/login?name=sachin
	//then @Requestparam is used
	
	
	//To send data from controller to jsp modelmap is used
	@RequestMapping("login")
	public String login(@RequestParam String name,ModelMap model) {
		
		
		
		//it is not a good practice to use sysout in prod instead we will use logger
		
		logger.debug("Request param {}",name);
		
		//to print it in info level
		logger.info("Request param {}",name);
		System.out.println("request param "+name);
		model.put("name", name);
		return "login";
	}
}
