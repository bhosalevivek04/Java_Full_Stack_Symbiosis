package com.vivek.recursion.fibonacci.main;

import com.vivek.recursion.fibonacci.Fibonacci;

public class MainFibonacci {

	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		int result = fibo.fibonacciSeries(5);
		System.out.println(result);
	}

}
