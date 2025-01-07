package com.vivek.logicprograms.presentationlayer;

import java.util.Scanner;

import com.vivek.logicprograms.armstrongnumber.ArmStrongNumber;
import com.vivek.logicprograms.charactercounting.CharacterCounting;
import com.vivek.logicprograms.perfectnumber.PerfectNumber;
import com.vivek.logicprograms.primenumber.PrimeNumber;
import com.vivek.logicprograms.reversenumber.ReverseNumber;
import com.vivek.logicprograms.reversestring.ReverseString;
import com.vivek.logicprograms.series.Series;

public class Helper {
	public int printMenu(Scanner scanner) {
		System.out.println("1. to check if Number is Palindrome");
		System.out.println("2. to check if Number is Armstrong");
		System.out.println("3. to check if Number is Perfect");
		System.out.println("4. to check if Number is Prime");
		System.out.println("5. to reverse the String");
		System.out.println("6. to reverse the String Line");
		System.out.println("7. to count vowels and consonants");
		System.out.println("8. to print fibonacci series");
		System.out.println("9. to print Qube Square Series");
		System.out.println("10. to print Alternative series");
		System.out.println("11. to print Character series");
		System.out.println("12. to print Pattern 1");
		System.out.println("0. for exit");
		return scanner.nextInt();
	}

	public void checkPallindrome(Scanner scanner) {
		ReverseNumber number = new ReverseNumber();
		System.out.println("Enter a Number:");
		int variable = scanner.nextInt();
		number.setNumber(variable);

		if (number.checkForPallindromeNumber()) {
			System.out.println(variable + " is a Pallindrome Number");
		} else {
			System.out.println(variable + " is a not Pallindrome Number");
		}
	}

	public void checkArmStrong(Scanner scanner) {
		ArmStrongNumber number = new ArmStrongNumber();
		System.out.println("Enter a Number:");
		int variable = scanner.nextInt();
		number.setNumber(variable);
		if (number.isArmstrongNumber()) {
			System.out.println(variable + " is a ArmStrong Number");
		} else {
			System.out.println(variable + " is a not ArmStrong Number");
		}
	}

	public void checkPerfect(Scanner scanner) {
		PerfectNumber number = new PerfectNumber();
		System.out.println("Enter a Number:");
		int variable = scanner.nextInt();
		number.setNumber(variable);
		if (number.isPerfectNumber()) {
			System.out.println(variable + " is a Perfect Number");
		} else {
			System.out.println(variable + " is a not Perfect Number");
		}
	}

	public void checkPrime(Scanner scanner) {
		PrimeNumber number = new PrimeNumber();
		System.out.println("Enter a Number:");
		int variable = scanner.nextInt();
		number.setNumber(variable);
		if (number.isPrime()) {
			System.out.println(variable + " is a Prime Number");
		} else {
			System.out.println(variable + " is a not Prime Number");
		}
	}

	public void reverseString(Scanner scanner) {
		ReverseString string = new ReverseString();
		System.out.println("Enter a String to Reverse: ");
		String variable = scanner.next();
		string.setVariable(variable);
		System.out.println("Reverse String: ");
		String result = string.reverseString();
		System.out.println(result);
	}

	public void reverseStringLine(Scanner scanner) {
		ReverseString string = new ReverseString();
		System.out.println("Enter a String Line to Reverse: ");
		scanner.nextLine();
		String variable = scanner.nextLine();
		string.setVariable(variable);
		System.out.println("Reverse String Line: ");
		String result = string.reverseStringLine();
		System.out.println(result);
	}

	public void characterCounting(Scanner scanner) {
		CharacterCounting character = new CharacterCounting();
		System.out.println("Enter a String to Count Vowels and Consonant: ");
		String variable = scanner.next();
		character.setVariable(variable);
		System.out.println("Count of Vowels and Consonant");
		character.countVowels();
	}

	public void printFibonacciSeries(Scanner scanner) {
		Series series = new Series();
		System.out.println("Enter a number to Calculate Fibonacci Series");
		int limit = scanner.nextInt();
		series.setLimit(limit);
		System.out.println("Fibonacci Series");
		series.printFibonacciSeries();
	}

	public void printQubeSquareSeries(Scanner scanner) {
		Series series = new Series();
		System.out.println("Enter a number upto you want print Qube Square Series");
		int variable = scanner.nextInt();
		series.setLimit(variable);
		System.out.println("Series:");
		series.printQubeSquareSeries();

	}

	public void printAlternativeSeries(Scanner scanner) {
		Series series = new Series();
		System.out.println("Enter a number upto Print Alternative Series 1 5 3 7 5 9 7 11");
		int variable = scanner.nextInt();
		series.setLimit(variable);
		System.out.println("Series:");
		series.printAlternativeSeries();
	}

	public void printCharSeries(Scanner scanner) {
		Series series = new Series();
		System.out.println("Enter a number upto Print A E C G E I G K");
		int variable = scanner.nextInt();
		series.setLimit(variable);
		System.out.println("Series: ");
		series.printCharSeries();
	}

	public void printPattern1(Scanner scanner) {
		Series series = new Series();
		System.out.println("Enter a number upto Print Pattern 1");
		int variable=scanner.nextInt();
		series.setLimit(variable);
		System.out.println("Pattern 1: ");
		series.printPattern1();
	}
}
