package com.example.grocery_booking_api.entite;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter @Setter
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
   
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private Double price;
    
    @Column(nullable = false)
    private String category;
    
    @Column(nullable = false)
    private int stock;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public product(Long id, String name, Double price, String category, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.stock = stock;
	}
	public product() {
		super();
	}
    
    
}