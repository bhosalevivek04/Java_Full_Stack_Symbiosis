package com.vivek.recursion.fibonacci;

public class Fibonacci {
	public int fibonacciSeries(int number) {
		if (number <= 1) {
			return number;
		}
		return fibonacciSeries(number - 1) + fibonacciSeries(number - 2);
	}
}
