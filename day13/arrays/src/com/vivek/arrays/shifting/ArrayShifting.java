package com.vivek.arrays.shifting;

public class ArrayShifting {
	public void leftShift(int[] intArray) {
		int temp = intArray[0];
		for (int i = 0; i < intArray.length - 1; i++) {
			intArray[i] = intArray[i + 1];
		}
		intArray[intArray.length - 1] = temp;
	}
	
	public void RightShift(int[] intArray) {
		int temp = intArray[intArray.length-1];
		for (int i = intArray.length-1; i > 0; i--) {
			intArray[i] = intArray[i-1];
		}
		intArray[0] = temp;
	}
}
