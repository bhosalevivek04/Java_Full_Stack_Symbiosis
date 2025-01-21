package com.vivek.arrays.sorting.main;

import java.util.Arrays;

import com.vivek.arrays.sorting.MergeSort;

public class MainMergeSort {

	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		int[] arr= {8,7,6,1,5,4};
		sort.setIntArray(arr);
		sort.mergeSort(0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
