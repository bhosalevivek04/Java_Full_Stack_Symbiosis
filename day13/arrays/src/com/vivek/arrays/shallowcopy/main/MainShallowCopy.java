package com.vivek.arrays.shallowcopy.main;

import com.vivek.arrays.shallowcopy.ShallowCopy;

public class MainShallowCopy {
	public static void main(String[] args) {
//		ShallowCopy copy = new ShallowCopy();
//		int[] arr = { 1, 2, 3, 4, 5 };
//
//		for (int num : arr) {
//			System.out.print(num + "\t");
//		}
//		System.out.println();
//		copy.shallowCopy(arr);
//		for (int num : arr) {
//			System.out.print(num + "\t");
//		}

		ShallowCopy copy1 = new ShallowCopy();
		copy1.setVariable(100);
		System.out.println(copy1.getVariable());

		ShallowCopy copy2 = copy1;
		copy2.setVariable(200);
		System.out.println(copy1.getVariable());
	}
}
