package com.vivek.arrays.deepcopy.main;

import com.vivek.arrays.deepcopy.DeepCopy;

public class MainDeepCopy {

	public static void main(String[] args) {
		DeepCopy copy = new DeepCopy();
		int[] arr = { 1, 2, 3, 4, 5 };
		copy.copyEachElement(arr);

	}

}
