package com.vivek.arrays.shifting.main;

import com.vivek.arrays.shifting.ArrayShifting;

public class MainArrayShifting {

	public static void main(String[] args) {
		ArrayShifting shifting = new ArrayShifting();
		int[] intArray = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");

		System.out.println();
		shifting.leftShift(intArray);

		//shallow copy concept
		for (int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");
		
		System.out.println();
		shifting.rightShift(intArray);
		for (int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");
	}

}
