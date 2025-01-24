package com.vivek.oops.inheritance.superclasses;

public class Product {
	String name;
	float price;
	String category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, float price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
