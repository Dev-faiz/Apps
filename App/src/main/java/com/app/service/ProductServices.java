package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Product;
import com.app.repo.ProductRepo;

@Service
public class ProductServices {
	
	private final ProductRepo productRepo ;
	
	public ProductServices(ProductRepo pr) {
		this.productRepo = pr ;
	}
	
	public Product addProduct(Product p) {
		return productRepo.save(p);
	}
	
	public List<Product> getAllProduct(){
		return productRepo.findAll();
	}
	
}
