package com.vivek.arrays.searching;

public class LinearSearch {
	public void linearSearchArray(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				System.out.println("Element " + target + " at index: " + i);
				return;
			}
		}
		System.out.println("Element " + target + " not found in the array.");
	}
}
