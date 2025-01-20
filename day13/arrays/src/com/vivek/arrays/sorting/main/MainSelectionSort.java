package com.vivek.arrays.sorting.main;

import java.util.Arrays;

import com.vivek.arrays.sorting.SelectionSort;

public class MainSelectionSort {

	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int[] intArray = { 5, 4, 3, 7, 2 };

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(intArray));
		sort.selectionSortInt(intArray);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(intArray));

		String[] StringArray = { "Vivek", "Tejas", "Navnath" };
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(StringArray));
		sort.selectionSortString(StringArray);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(StringArray));

	}

}
