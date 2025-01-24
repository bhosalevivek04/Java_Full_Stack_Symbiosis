package com.vivek.oops.inheritance.main;

import com.vivek.oops.inheritance.subclasses.Dog;

public class MainDogAnimal {
	public static void main(String[] args) {
		Dog pintu = new Dog("German Shephard", 4, "black", 23);
		System.out.println(pintu.getAge());
		System.out.println(pintu.getBreed());
		System.out.println(pintu.getColor());
		System.out.println(pintu.getLegs());
	}

}
