package com.vivek.oops.inheritance.subclasses;

import com.vivek.oops.inheritance.superclasses.Product;

public class Food extends Product{
	String expiry_date;
	float weight;
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Food(String expiry_date, float weight) {
		super();
		this.expiry_date = expiry_date;
		this.weight = weight;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
}
