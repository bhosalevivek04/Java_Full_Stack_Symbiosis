package com.vivek.oops.inheritance.superclasses;

public class Animal {
//	private String color;
	protected String color;
	private int age;

	public Animal() {
		System.out.println("Animal Constructor");
	}

	public Animal(String color, int age) {
		super();
		this.color = color;
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
