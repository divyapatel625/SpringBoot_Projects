package com.ProductSpring.ProductSpring;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);
		
		
		ProductService Service = context.getBean(ProductService.class);
		
		List<Product> products = Service.getallProducts();
		
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
