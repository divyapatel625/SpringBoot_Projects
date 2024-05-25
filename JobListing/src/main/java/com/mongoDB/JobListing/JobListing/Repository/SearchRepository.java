package com.mongoDB.JobListing.JobListing.Repository;

import java.util.List;

import com.mongoDB.JobListing.JobListing.model.Post;

public interface SearchRepository {

	List<Post> findByText(String text);
}
