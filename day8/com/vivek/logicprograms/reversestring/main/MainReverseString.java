package com.vivek.logicprograms.reversestring.main;

import java.util.Scanner;

import com.vivek.logicprograms.reversestring.ReverseString;

public class MainReverseString {

	public static void main(String[] args) {
		ReverseString string = new ReverseString();
		Scanner scanner = new Scanner(System.in);
//		String variable = scanner.next();
//		string.setVariable(variable);
//		String reverse = string.reverseString();
//		System.out.println(reverse);

		System.out.println("Enter a Address to reverse: ");
		String variable = scanner.nextLine();
		string.setVariable(variable);

		String reverseLine = string.reverseStringLine();
		System.out.println("Reverse Address: ");
		System.out.println(reverseLine);
		scanner.close();
	}

}