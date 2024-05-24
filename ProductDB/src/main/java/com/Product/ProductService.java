package com.Product;

import java.util.List;

public class ProductService {
	
 ProductDB db = new ProductDB();
	/**
	 * Default Constructor
	 */
	public ProductService() {
		
	}

	public void addProduct(Product p) {
		
		db.save(p);
		
	}

	public List<Product> getProductByName(String name) {
		 
				
		return db.findByname(name);
	}
	
	public List<Product> getallProducts() {
			return db.fetchAll();
	}

}
