package com.vivek.arrays.sorting.main;

import java.util.Arrays;

import com.vivek.arrays.sorting.InsertionSort;

public class MainInsertionSort {
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();

		int[] arr = { 8, 5, 3, 1, 2 };
		sort.setIntArray(arr);
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		sort.insertionSortInt();
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(arr));

		System.out.println();

		String[] array = { "Vivek", "Tejas", "Navnath" };
		sort.setStringArray(array);
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));
		sort.insertionSortString();
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(array));
	}
}
