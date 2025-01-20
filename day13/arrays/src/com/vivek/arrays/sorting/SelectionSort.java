package com.vivek.arrays.sorting;

public class SelectionSort {
	public void selectionSortInt(int[] intArray) {
		for (int i = 0; i < intArray.length - 1; i++) {
			int key = i;
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[j] < intArray[key]) {
					key = j;
				}
			}
			int temp = intArray[key];
			intArray[key] = intArray[i];
			intArray[i] = temp;
		}
	}

	public void selectionSortString(String[] StringArray) {
		int key;
		String temp;
		for (int i = 0; i < StringArray.length - 1; i++) {
			key = i;
			for (int j = i + 1; j < StringArray.length; j++) {
				if (StringArray[j].compareTo(StringArray[key]) < 0) {
					key = j;
				}
			}
			temp = StringArray[key];
			StringArray[key] = StringArray[i];
			StringArray[i] = temp;
		}

	}
}