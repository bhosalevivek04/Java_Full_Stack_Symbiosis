package com.vivek.java8features.testingfunctionalinterfaces;

import java.util.function.Function;

public class TestFunctionInterface {
	public static void main(String[] args) {
		Function<String, Integer> lengthFunction = (name) -> name.length();
		int length = lengthFunction.apply("Vivek");
		System.out.println(length);

		Function<Integer, Float> generateBill = (units) -> {
			return units * 7.48f;
		};
		System.out.println(generateBill.apply(10));
	}
}
