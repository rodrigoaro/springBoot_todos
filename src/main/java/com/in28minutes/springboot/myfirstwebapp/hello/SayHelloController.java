package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello, what are you learning today?";
	}
	
	@RequestMapping("/say-hello-jsp")
	public String sayHelloHtml() {
		return "sayHello";
	}
	

}
