package com.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {
	Connection con = null;
	/**
	 * Default Constructor
	 */
	public ProductDB() {
		  try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Divya", "postgres", "0000");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void save(Product p) {
	
		
		String query = "insert into product (name, type, place, warranty) values(?,?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, p.getName());
			st.setString(2, p.getPlace()); 
			st.setString(3, p.getType()); 
			st.setInt(4, p.getWarranty()); 
			
			st.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public List<Product> fetchAll() {
		List<Product> products = new ArrayList<>();
		
		String query = "select name, type, place, warranty from product";
		try {
			PreparedStatement st = con.prepareStatement(query);
			ResultSet resultset = st.executeQuery();
			
			while(resultset.next()) {
				Product p = new Product();
				p.setName(resultset.getString(1));
				p.setPlace(resultset.getString(2));
				p.setType(resultset.getString(3));
				p.setWarranty(resultset.getInt(4));
								
				products.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
	public List<Product> findByname(String name) {
		List<Product> products = new ArrayList<>();
		String query = "select name, type, place, warranty from product where product.name like ?";
		
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, "%"+name+"%");
			
			ResultSet rs = st.executeQuery();
			
			
			while(rs.next()) {
				Product p = new Product();
				p.setName(rs.getString(1));
				p.setPlace(rs.getString(2));
				p.setType(rs.getString(3));
				p.setWarranty(rs.getInt(4));
				
				products.add(p);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return products;
	}
}
