package com.vivek.arrays.shifting;

public class ArrayShifting {
	public void leftShift(int[] intArray) {
		int temp = intArray[0];
		for (int i = 0; i < intArray.length - 1; i++) {
			intArray[i] = intArray[i + 1];
		}
		intArray[intArray.length - 1] = temp;
	}

	public void leftShiftWithPosition(int[] intArray, int n) {
		for (int i = 0; i < n % intArray.length; i++) {
			int temp = intArray[0];
			for (int j = 0; j < intArray.length - 1; j++) {
				intArray[j] = intArray[j + 1];
			}
			intArray[intArray.length - 1] = temp;
		}
	}

	public void rightShift(int[] intArray) {
		int temp = intArray[intArray.length - 1];
		for (int i = intArray.length - 1; i > 0; i--) {
			intArray[i] = intArray[i - 1];
		}
		intArray[0] = temp;
	}

	public void RightShiftWithPosition(int[] intArray, int n) {
		for (int i = 0; i < n % intArray.length; i++) {
			int temp = intArray[intArray.length - 1];
			for (int j = intArray.length - 1; j > 0; j--) {
				intArray[j] = intArray[j - 1];
			}
			intArray[0] = temp;
		}
	}
}
