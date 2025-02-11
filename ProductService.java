package com.example.grocery_booking_api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.grocery_booking_api.Repository.ProductRepository;
import com.example.grocery_booking_api.entite.product;


@Service
public class ProductService {
	
	
    private final ProductRepository productRepository;

    @Autowired  
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    
    @Transactional
    public product saveProduct(product product) {
        return productRepository.save(product);
    }
    
    
    public List<product> getAllProducts() {
        return productRepository.findAll();
    }
}