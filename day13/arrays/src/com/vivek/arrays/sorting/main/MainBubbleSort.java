package com.vivek.arrays.sorting.main;

import java.util.Arrays;

import com.vivek.arrays.sorting.BubbleSort;

public class MainBubbleSort {

	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		String[] names = { "Vivek", "Navnath", "Tejas", "Suyash", "Aayush" };

		sort.setStringArray(names);

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(names));

		System.out.println();
		sort.bubbleSortString();

		System.out.println("After Sorting");
		System.out.println(Arrays.toString(names));

		System.out.println();
		int[] intArray = { 5, 4, 3, 7, 2 };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(intArray));
		sort.bubbleSortInteger(intArray);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(intArray));
	}

}
