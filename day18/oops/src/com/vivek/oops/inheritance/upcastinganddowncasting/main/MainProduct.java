package com.vivek.oops.inheritance.upcastinganddowncasting.main;

import com.vivek.oops.inheritance.upcastinganddowncasting.subclass.Electronics;
import com.vivek.oops.inheritance.upcastinganddowncasting.superclass.Product;

public class MainProduct {
	public static void main(String[] args) {
		//upcasting
		Product product=new Electronics(12);
		
		//downcasting
//		Electronics electronic=(Electronics) new Product("Charger");
//		electronic.print();
//		
//		product.print();
}
}