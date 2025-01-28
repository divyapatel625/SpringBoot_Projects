package com.springboot.rest.webservice.restfull_web_services.User;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
		User user =  service.findUserById(id);
		
		if (user == null)
			throw new userNotFoundException("id"+id);
		
		return user;
	}

	@PostMapping("/users")
	public ResponseEntity<Object> CreateUser(@RequestBody User user) {
		User savedUser = service.saveUser(user);
		
		 URI location = ServletUriComponentsBuilder.fromCurrentRequest().
				 path("/{id}").
				 buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

}
