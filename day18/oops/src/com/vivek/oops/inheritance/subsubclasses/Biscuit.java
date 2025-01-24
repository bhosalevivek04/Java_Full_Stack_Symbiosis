package com.vivek.oops.inheritance.subsubclasses;

import com.vivek.oops.inheritance.subclasses.Food;

public class Biscuit extends Food{
	String flavor;
	String type;
	public Biscuit(String flavor, String type) {
		super();
		this.flavor = flavor;
		this.type = type;
	}
	public Biscuit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
