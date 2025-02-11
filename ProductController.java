package com.example.grocery_booking_api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.grocery_booking_api.Service.ProductService;
import com.example.grocery_booking_api.entite.product;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	
	 private final ProductService productService;

	    @Autowired
	    public ProductController(ProductService productService) {
	        this.productService = productService;
	    }

	    
	    @PostMapping
	    public ResponseEntity<product> createProduct(@RequestBody product product) {
	        product savedProduct = productService.saveProduct(product);
	        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	    }
	    
	    
	    
	    
	    @GetMapping
	    public ResponseEntity<List<product>> getAllProducts() {
	        return ResponseEntity.ok(productService.getAllProducts());
	    }

}
