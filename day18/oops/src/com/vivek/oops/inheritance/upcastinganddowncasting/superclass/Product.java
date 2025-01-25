package com.vivek.oops.inheritance.upcastinganddowncasting.superclass;

public class Product {
	private String name;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println(name);
	}
	
	public void printProduct(){
		System.out.println("Product Class");
	}
	
}
