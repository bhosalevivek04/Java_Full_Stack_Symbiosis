package com.vivek.java8features.testingfunctionalinterfaces;

import com.vivek.java8features.testingfunctionalinterfaces.entities.BiConsumerObjects;

public class TestBiConsumer {
//		BiConsumer<String, Integer> nameAndAge = new BiConsumer<String, Integer>() {
//			public void accept(String name, Integer age) {
//				System.out.println("Name: " + name + " Age: " + age);
//			}
//		};
//		nameAndAge.accept("Vivek", 20);

//		BiConsumer<String, Integer> nameAndAgeConsumer = (name, age) -> {
//			System.out.println("Name: " + name + " Age: " + age);
//		};
////		nameAndAgeConsumer.accept("Vivek", 20);
//
//		BiConsumer<String, Integer> validVoterConsumer = (name, age) -> {
//			System.out.println((age > 18) ? "Valid Voter" : "Invalid Voter");
//		};
//
//		BiConsumer<String, Integer> votingList = nameAndAgeConsumer.andThen(validVoterConsumer);
//		votingList.accept("Navnath", 65);

	public static void main(String[] args) {
		BiConsumerObjects.nameAndAgeConsumer.accept("Vivek", 20);

		BiConsumerObjects.validVoterConsumer.accept("Vivek", 20);
	}
}
