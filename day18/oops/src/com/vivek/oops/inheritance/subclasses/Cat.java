package com.vivek.oops.inheritance.subclasses;

public class Cat {
	String type;
	boolean isWild;
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String type, boolean isWild) {
		this.type = type;
		this.isWild = isWild;
	}
	public Cat(String type, boolean isWild,String color,int age) {
//		super(color,age);
		this.type = type;
		this.isWild = isWild;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isWild() {
		return isWild;
	}
	public void setWild(boolean isWild) {
		this.isWild = isWild;
	}
	
}
