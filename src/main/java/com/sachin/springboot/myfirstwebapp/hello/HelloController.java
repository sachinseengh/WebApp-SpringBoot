package com.sachin.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	
	public String sayHello() {
		return "Hello my name is sachin";
	}
	
	
	//Now printing with the help of jsp
	@RequestMapping("say-hello-jsp")

	
	public String sayHelloJSP() {
		return "sayhello";
	}
}
