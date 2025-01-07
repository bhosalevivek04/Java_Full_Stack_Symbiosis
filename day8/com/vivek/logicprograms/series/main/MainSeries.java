package com.vivek.logicprograms.series.main;

import java.util.Scanner;

import com.vivek.logicprograms.series.Series;

public class MainSeries {
	public static void main(String[] args) {
		Series series = new Series();
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter number to check Fibonacci Series :");
//		int variable = scanner.nextInt();
//		series.setLimit(variable);
//		System.out.println("Fibonacci Series of " + variable + " digit");
//		series.printFibonacciSeries();

//		System.out.println("Enter a Number to print Qube Square Series");
//		int variable = scanner.nextInt();
//		series.setLimit(variable);
//		System.out.println("Qube Square series for " + variable + " digit:");
//		series.printQubeSquareSeries();
		
		System.out.println("Enter a Number: ");
		int variable=scanner.nextInt();
		series.setLimit(variable);
//		series.printAlternativeSeries();
		
		series.printCharSeries();
		scanner.close();
	}
}
