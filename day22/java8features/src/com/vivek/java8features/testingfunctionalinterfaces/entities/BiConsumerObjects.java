package com.vivek.java8features.testingfunctionalinterfaces.entities;

import java.util.function.BiConsumer;

public class BiConsumerObjects {
	public static final BiConsumer<String, Integer> nameAndAgeConsumer = (name, age) -> {
		System.out.println("Name: " + name + " Age: " + age);
	};
//	nameAndAgeConsumer.accept("Vivek", 20);

	public static final BiConsumer<String, Integer> validVoterConsumer = (name, age) -> {
		System.out.println((age > 18) ? "Valid Voter" : "Invalid Voter");
	};

	public static final BiConsumer<String, Integer> votingList = nameAndAgeConsumer.andThen(validVoterConsumer);
}
