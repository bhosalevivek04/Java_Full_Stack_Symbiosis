package com.vivek.logicprograms.reversenumber.main;

import com.vivek.logicprograms.reversenumber.ReverseNumber;

public class MainReverseNUmber {

	public static void main(String[] args) {
		ReverseNumber number=new ReverseNumber();
		number.setNumber(121);
		System.out.println(number.reverseNumber());
		
//		if(number.checkForPallindromeNumber()) {
//			System.out.println("Given number is Pallindrome");
//		}else {
//			System.out.println("Given number is Not Pallindrome");
//		}
		System.out.println((number.checkForPallindromeNumber())?"Number is Palindrome":"NUmber is Not Palindrome");
	}

}
