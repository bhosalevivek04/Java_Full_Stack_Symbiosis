package com.vivek.arrays.operations;

public class ArrayOperation {
	public void findMaximum(int[] array) {
		int temp = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (temp < array[i]) {
				temp = array[i];
			}
		}
		System.out.println("Largest Element: " + temp);
	}

	public void findMinimum(int[] array) {
		int temp = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (temp > array[i]) {
				temp = array[i];
			}
		}
		System.out.println("Smallest Element: " + temp);
	}
}
