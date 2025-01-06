package com.vivek.logicprograms.primenumber.main;

//import java.util.Scanner;

import com.vivek.logicprograms.primenumber.PrimeNumber;

public class MainPrimeNumber {
	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter a Number:");
//		int num=scanner.nextInt();
		PrimeNumber number=new PrimeNumber();
		
		for (int i = 1; i <=100; i++) {
			number.setNumber(i);
			if(number.isPrime()) {
				System.out.println(i+" is Prime Number");
			}else {
				System.out.println(i+" is Not Prime Number");
			}
		}
//		scanner.close();
	}
}
