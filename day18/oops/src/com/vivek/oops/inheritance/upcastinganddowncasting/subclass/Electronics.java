package com.vivek.oops.inheritance.upcastinganddowncasting.subclass;

import com.vivek.oops.inheritance.upcastinganddowncasting.superclass.Product;

public class Electronics extends Product {
	private int voltage;

	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electronics(int voltage) {
		super();
		this.voltage = voltage;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public void print() {
		System.out.println(voltage);
	}
	public void printElectronics(){
		System.out.println("Electronics Class");
	}
}
