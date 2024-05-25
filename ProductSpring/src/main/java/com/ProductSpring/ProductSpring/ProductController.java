package com.ProductSpring.ProductSpring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getallProducts();
	}

	@GetMapping("/product/{name}")
	public Product getProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	
	@PostMapping("/product")
	public void addProduct(@RequestBody Product P) {
		service.addProduct(P);
	}
}
