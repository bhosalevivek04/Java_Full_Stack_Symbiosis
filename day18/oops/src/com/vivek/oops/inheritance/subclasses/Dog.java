package com.vivek.oops.inheritance.subclasses;

import com.vivek.oops.inheritance.superclasses.Animal;

public class Dog extends Animal {
	private String breed;
	private int legs;

	public Dog() {
//		
		System.out.println("Dog Constructor");
	}

	public Dog(String breed, int legs, String colour, int age) {
		super(colour, age);
		this.breed = breed;
		this.legs = legs;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

}