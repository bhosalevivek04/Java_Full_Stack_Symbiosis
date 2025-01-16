package com.vivek.recursion.operations.main;

import com.vivek.recursion.operations.Operations;

public class MainOperations {

	public static void main(String[] args) {
		Operations operation = new Operations();
//		int sum=operation.calculateSum(5);

		int result = operation.calculateFactorial(5);
		System.out.println(result);

		int result1 = operation.calculatePower(5, 3);
		System.out.println(result1);

		boolean isPrime = operation.isPrime(2, 2);
		System.out.println(isPrime);
		
		operation.printTable(5, 10);
	}

}
