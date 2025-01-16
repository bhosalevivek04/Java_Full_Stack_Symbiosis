package com.vivek.recursion.operations;

public class Operations {
	public int calculateSum(int no) {
		if (no < 0)
			return 1;
		return no + calculateSum(no - 1);
	}

	public int calculateFactorial(int no) {
		if (no <= 0) {
			return 1;
		}
		return no * calculateFactorial(no - 1);
	}

	public int calculatePower(int base, int expo) {
//		if (expo <= 1) {
//			return base;
//		}
//		return base * calculatePower(base, expo - 1);

		return (expo <= 1) ? base : base * calculatePower(base, expo - 1);
	}

	public boolean isPrime(int number, int factor) {
		if (number < 2) {
			return false;
		}
		if (factor * factor > number) {
			return true;
		}
		if (number % factor == 0) {
			return false;
		}
		return isPrime(number, factor + 1);
	}

	public void printTable(int table, int limit) {
		if (limit < 1) {
			return;
		}
		printTable(table, limit - 1);
		System.out.println(table * limit);
	}
}
