package com.vivek.arrays.copyarray;

public class CopyArray {
	public int[] firstArray;
	public int[] secondArray;

	public CopyArray() {

	}

	public CopyArray(int[] firstArray, int[] secondArray) {
		super();
		this.firstArray = firstArray;
		this.secondArray = secondArray;
	}

	public int[] getFirstArray() {
		return firstArray;
	}

	public void setFirstArray(int[] firstArray) {
		this.firstArray = firstArray;
	}

	public int[] getSecondArray() {
		return secondArray;
	}

	public void setSecondArray(int[] secondArray) {
		this.secondArray = secondArray;
	}

	public int[] copyTwoArrays() {
		int[] resultArray = new int[firstArray.length + secondArray.length];
		int r = 0;
		for (int f = 0; f < firstArray.length; f++) {
			resultArray[r++] = firstArray[f];

		}
		for (int s = 0; s < secondArray.length; s++) {
			resultArray[r++] = secondArray[s];

		}
		return resultArray;
	}

	public int[] copyFirstHalfAndSecondHalfArray() {
		int midFirst = (firstArray.length + 1) / 2;
		int midSecond = secondArray.length / 2;
		int[] result = new int[midFirst + (secondArray.length - midSecond)];
		int r = 0;
		for (int f = 0; f < midFirst; f++) {
			result[r++] = firstArray[f];
		}

		for (int s = midSecond; s < secondArray.length; s++) {
			result[r++] = secondArray[s];
		}
		return result;
	}

	public int[] copyAndSortTwoHalfArray() {
		int mid1 = (firstArray.length - 1) / 2;
		int mid2 = (secondArray.length - 1) / 2;
		int[] result = new int[mid1 + 1 + mid2 + 1];

		int f = 0;
		int s = mid2;
		int r = 0;
		while (f <= mid1 && s < secondArray.length) {
			if (firstArray[f] < secondArray[s]) {
				result[r++] = firstArray[f++];
			} else {
				result[r++] = secondArray[s++];
			}
		}
		while (f <= mid1 || s < secondArray.length) {
			if (f <= mid1 && (s >= secondArray.length || firstArray[f] < secondArray[s])) {
				result[r++] = firstArray[f++];
			} else if (s < secondArray.length) {
				result[r++] = secondArray[s++];
			}
		}

		return result;
	}

}
