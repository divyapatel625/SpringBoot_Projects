package com.springboot.rest.webservice.restfull_web_services.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String HelloWorld() {
		return "Hello world!!";
	}
	

}
