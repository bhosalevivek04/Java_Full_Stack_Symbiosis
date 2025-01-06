package com.vivek.logicprograms.presentationlayer;

import java.util.Scanner;

import com.vivek.logicprograms.armstrongnumber.ArmStrongNumber;
import com.vivek.logicprograms.perfectnumber.PerfectNumber;
import com.vivek.logicprograms.primenumber.PrimeNumber;
import com.vivek.logicprograms.reversenumber.ReverseNumber;

public class Helper {
	public int printMenu(Scanner scanner) {
		System.out.println("1. to check if Number is Palindrome");
		System.out.println("2. to check if Number is Armstrong");
		System.out.println("3. to check if Number is Perfect");
		System.out.println("4. to check if Number is Prime");
		System.out.println("0. for exit");
		return scanner.nextInt();
	}
	public void checkPallindrome(Scanner scanner) {
		ReverseNumber number=new ReverseNumber();
		System.out.println("Enter a Number:");
		int variable=scanner.nextInt();
		number.setNumber(variable);
		
		if(number.checkForPallindromeNumber()) {
			System.out.println(variable+" is a Pallindrome Number");
		}else {
			System.out.println(variable+" is a not Pallindrome Number");
		}
	}
	
	public void checkArmStrong(Scanner scanner) {
		ArmStrongNumber number=new ArmStrongNumber();
		System.out.println("Enter a Number:");
		int variable=scanner.nextInt();
		number.setNumber(variable);
		if(number.isArmstrongNumber()) {
			System.out.println(variable+" is a ArmStrong Number");
		}else {
			System.out.println(variable+" is a not ArmStrong Number");
		}
	}
	
	public void checkPerfect(Scanner scanner) {
		PerfectNumber number=new PerfectNumber();
		System.out.println("Enter a Number:");
		int variable=scanner.nextInt();
		number.setNumber(variable);
		if(number.isPerfectNumber()) {
			System.out.println(variable+" is a Perfect Number");
		}else {
			System.out.println(variable+" is a not Perfect Number");
		}
	}
	
	public void checkPrime(Scanner scanner) {
		PrimeNumber number=new PrimeNumber();
		System.out.println("Enter a Number:");
		int variable=scanner.nextInt();
		number.setNumber(variable);
		if(number.isPrime()) {
			System.out.println(variable+" is a Prime Number");
		}else {
			System.out.println(variable+" is a not Prime Number");
		}
	}
}
