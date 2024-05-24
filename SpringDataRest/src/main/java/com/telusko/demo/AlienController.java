package com.telusko.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.demo.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienRepo alienRepo;
	
	
	@GetMapping("alien")
	public List<Alien> getAlien() {
		
		return alienRepo.findAll();
	}
}
