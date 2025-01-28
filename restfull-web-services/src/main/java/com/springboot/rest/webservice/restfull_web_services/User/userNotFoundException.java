package com.springboot.rest.webservice.restfull_web_services.User;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class userNotFoundException extends RuntimeException {

	
	public userNotFoundException(String message){
		super(message);
	}
}
