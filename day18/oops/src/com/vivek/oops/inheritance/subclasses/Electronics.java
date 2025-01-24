package com.vivek.oops.inheritance.subclasses;

import com.vivek.oops.inheritance.superclasses.Product;

public class Electronics extends Product{
	String brand;
	String warranty;
	String modelNumber;
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electronics(String brand, String warranty, String modelNumber) {
		super();
		this.brand = brand;
		this.warranty = warranty;
		this.modelNumber = modelNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
}
