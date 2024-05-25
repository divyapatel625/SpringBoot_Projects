package com.mongoDB.JobListing.JobListing.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongoDB.JobListing.JobListing.Repository.PostRepository;
import com.mongoDB.JobListing.JobListing.Repository.SearchRepository;
import com.mongoDB.JobListing.JobListing.model.Post;

import springfox.documentation.annotations.ApiIgnore;

@RestController
public class PostController {

	@Autowired
	PostRepository repo;
	
	@Autowired
	SearchRepository searchRepo;
	
	@ApiIgnore
	@GetMapping("/")
	public void swaggerRedirect(HttpServletResponse resposne) throws IOException {
		resposne.sendRedirect("swagger-ui.html");
     }
	
	@GetMapping("/posts")
	public List<Post> getAllPost(){
		return repo.findAll();
	}
	
	@GetMapping("/posts/{text}")
	public List<Post> search(@PathVariable String text){
		return searchRepo.findByText(text);
	} 
	
	@PostMapping("/post")
	public void addPost(@RequestBody Post post) {
		repo.save(post);
	}
	
}
