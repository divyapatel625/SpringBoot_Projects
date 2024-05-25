package com.mongoDB.JobListing.JobListing.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongoDB.JobListing.JobListing.model.Post;


public interface PostRepository extends MongoRepository<Post, String>{

	

}
