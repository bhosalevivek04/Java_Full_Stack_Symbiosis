package com.vivek.logicprograms.perfectnumber;

public class PerfectNumber {
	int number;

	public PerfectNumber() {
	}

	public PerfectNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isPerfectNumber() {
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum == number;
	}
}
