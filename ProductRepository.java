package com.example.grocery_booking_api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.grocery_booking_api.entite.product;

@Repository
public interface ProductRepository extends JpaRepository<product, Long> {
	List<product> findByCategory(String category);}
