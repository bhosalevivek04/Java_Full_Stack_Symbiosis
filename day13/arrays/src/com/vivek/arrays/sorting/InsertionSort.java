package com.vivek.arrays.sorting;

public class InsertionSort {
	int[] intArray;
	String[] stringArray;

	public InsertionSort() {

	}

	public int[] getIntArray() {
		return intArray;
	}

	public InsertionSort(int[] intArray) {
		this.intArray = intArray;
	}

	public InsertionSort(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}

	public String[] getStringArray() {
		return stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public void insertionSortInt() {
		for (int i = 1; i < intArray.length; i++) {
			int temp = intArray[i];
			int j = i - 1;
			while (j >= 0 && intArray[j] > temp) {
				intArray[j + 1] = intArray[j];
				j--;
			}
			intArray[j + 1] = temp;
		}
	}

	public void insertionSortString() {
		for (int i = 1; i < stringArray.length; i++) {
			String temp = stringArray[i];
			int j = i - 1;
			while (j >= 0 && stringArray[j].compareTo(temp) > 0) {
				stringArray[j + 1] = stringArray[j];
				j--;
			}
			stringArray[j + 1] = temp;
		}
	}
}
