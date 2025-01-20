package com.vivek.arrays.copyarray.main;

import java.util.Arrays;

import com.vivek.arrays.copyarray.CopyArray;

public class MainCopyArray {
	public static void main(String[] args) {
		int[] firstArray = { 5, 7, 6, 3 };
		int[] secondArray = { 8, 9, 1, 2, 4 };
		CopyArray copyArray = new CopyArray();
		copyArray.setFirstArray(firstArray);
		copyArray.setSecondArray(secondArray);
//		int[] result = copyArray.copyTwoArrays();
		int[] result1=copyArray.copyFirstHalfAndSecondHalfArray();
		System.out.println(Arrays.toString(result1));
	}
}
