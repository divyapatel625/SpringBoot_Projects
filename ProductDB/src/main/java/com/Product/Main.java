package com.Product;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ProductService service = new ProductService();
		
//		service.addProduct(new Product("Grey Laptop", "Laptop", "Brown Table", 2027));
//		service.addProduct(new Product("Samsung M31 Charger", "Mobile Charger", "Drawer", 2030));
//		service.addProduct(new Product("Black Laptop", "Laptop", "Black Table", 2022));
//		service.addProduct(new Product("C type", "Cable", "TV", 2020));
//		service.addProduct(new Product("Mobile", "Mobile", "TV", 2050));
//		service.addProduct(new Product("Documents", "paper", "Cubboard", 2045));
//		service.addProduct(new Product("Mouse", "Laptop", "Brown Table", 2025));

//		List<Product> products = service.getallProducts();
		List<Product> products = service.getProductByName("Black");
		
		for(Product p:products) {
			System.out.println(p);
		}
	}

}
