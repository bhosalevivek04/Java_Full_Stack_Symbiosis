package com.vivek.java8features.testingfunctionalinterfaces;

import java.util.function.Supplier;

public class TestSupplierInterface {
	public static void main(String[] args) {
		Supplier<Integer> randomIntSupplier = () -> (int) (Math.random() * 100);

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = randomIntSupplier.get();
		}

		for (int var : arr) {
			System.out.print(var+" ");
		}
	}
}
