package com.ProductSpring.ProductSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
class ProductService {
	
@Autowired	
 ProductDB db;
	

	public void addProduct(Product p) {
		
		db.save(p);
		
	}

//	public List<Product> getProductByName(String name) {
//		 
//				
//		return db.findByname(name);
//	}
	
	public List<Product> getallProducts() {
			return db.findAll();
	}

}
