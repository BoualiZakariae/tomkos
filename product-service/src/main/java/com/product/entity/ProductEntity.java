package com.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.product.enums.Category;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name = "products")
public class ProductEntity {

	@Id
	@GeneratedValue
	private Long id;
	
	private double price;
	
	private Category category;
	
	private String brand;
	
	private String model;
	
	private double weight;
	
	public ProductEntity() {
	}

	public ProductEntity(double price, Category category, String brand, String model, double weight) {
		this.price = price;
		this.category = category;
		this.brand = brand;
		this.model = model;
		this.weight = weight;
	}

	public Long getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}
