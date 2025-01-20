package com.vivek.arrays.sorting;

public class BubbleSort {
	String[] stringArray;

	public BubbleSort() {
	}

	public BubbleSort(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public String[] getStringArray() {
		return stringArray;
	}

	public void setStringArray(String[] stringArray) {
		this.stringArray = stringArray;
	}

	public void bubbleSortString() {
		int flag;
		for (int i = 0; i < stringArray.length - 1; i++) {
			flag = 0;
			for (int j = 0; j < stringArray.length - i - 1; j++) {
				if (stringArray[j].compareTo(stringArray[j + 1]) > 0) {
					String temp = stringArray[j];
					stringArray[j] = stringArray[j + 1];
					stringArray[j + 1] = temp;
					flag = 1;
				}
			}
			for (String name : stringArray) {
				System.out.print(name + " ");
			}
			System.out.println();

			if (flag == 0) {
				break;
			}
		}
	}
	
	public void bubbleSortInteger(int[] intArray) {
	    int flag;
	    for (int i = 0; i < intArray.length - 1; i++) {
	        flag = 0;
	        for (int j = 0; j < intArray.length - i - 1; j++) {
	            if (intArray[j] > intArray[j + 1]) {
	                int temp = intArray[j];
	                intArray[j] = intArray[j + 1];
	                intArray[j + 1] = temp;
	                flag = 1;
	            }
	        }
	        for (int number : intArray) {
	            System.out.print(number + " ");
	        }
	        System.out.println();

	        if (flag == 0) {
	            break;
	        }
	    }
	}
}