package com.springboot.rest.webservice.restfull_web_services.User;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	private UserDaoService service;
	
	public UserController(UserDaoService service) {
		this.service = service;
	}
	
	@GetMapping("/users")
	public List<User> GetUser() {
		return service.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User GetUser(@PathVariable int id) {
		return service.findUserById(id);
	}
}
