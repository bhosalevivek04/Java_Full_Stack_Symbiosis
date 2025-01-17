package com.vivek.arrays.searching;

public class BinarySearch {
	public void binarySearchInArray(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				System.out.println("Element " + target + " at index: " + mid);
				return;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println("Element " + target + " not found in the array.");
	}
}
