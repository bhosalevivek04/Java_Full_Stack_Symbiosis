package com.vivek.arrays.deepcopy;

import java.util.Arrays;

public class DeepCopy {
	public void copyEachElement(int[] srcArray) {
		int[] destArray = new int[srcArray.length];
		for (int i = 0; i < srcArray.length; i++) {
			destArray[i] = srcArray[i];
		}

		System.out.println("Source Array");
		for (int number : srcArray) {
			System.out.print(number+" ");
		}

		System.out.println();
		System.out.println("Destination Array");
		System.out.println(Arrays.toString(destArray));
		destArray[0] = 111;
		System.out.println("Destination Array");
		System.out.println(Arrays.toString(destArray));

		System.out.println("Source Array");
		for (int number : srcArray) {
			System.out.print(number+" ");
		}
	}
}
