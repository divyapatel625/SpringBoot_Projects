package com.springboot.rest.webservice.restfull_web_services.User;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component 
class UserDaoService {

	
	private static List<User> users = new  ArrayList<User>();
	static {
		users.add(new User(1, "James", LocalDate.now().minusYears(20)));
		users.add(new User(2, "Mark", LocalDate.now().minusYears(25)));
		users.add(new User(3, "Scott", LocalDate.now().minusYears(30)));
		users.add(new User(4, "Scott", LocalDate.now().minusYears(27)));
		users.add(new User(5, "Scott", LocalDate.now().minusYears(32)));
	}
	
	public List<User> findAll() {
		return users;
	}

	public User findUserById(int id) {
		
		Predicate<? super User> Predicate = user -> user.getId().equals(id);
		return users.stream().filter(Predicate).findFirst().get();
				}
	
}
