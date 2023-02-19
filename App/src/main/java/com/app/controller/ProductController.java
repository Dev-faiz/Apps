package com.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Product;
import com.app.service.ProductServices;

@RestController
public class ProductController {

	private final ProductServices productServices ;
	
	public ProductController(ProductServices ps) {
		this.productServices = ps ; 
	}
	
	@PostMapping("add")
	public ResponseEntity<Product> addHandler(@RequestBody Product p){
		return new ResponseEntity<>(productServices.addProduct(p) , HttpStatus.CREATED);
	}
	
	@GetMapping("getAll")
	public ResponseEntity<List<Product>> getAllHandler(){
		
		return new ResponseEntity<List<Product>>( productServices.getAllProduct() , HttpStatus.FOUND);
	}
	
	@GetMapping("/")
	public String home() {
		return "working" ;
	}
	
}
