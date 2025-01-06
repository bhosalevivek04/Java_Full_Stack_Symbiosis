package com.vivek.logicprograms.armstrongnumber.main;

// import java.util.Scanner;

import com.vivek.logicprograms.armstrongnumber.ArmStrongNumber;

public class MainArmstrongNumber {
	public static void main(String[] args) {
		ArmStrongNumber number = new ArmStrongNumber();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a Number for checking ArmStrong :");
//		int variable = scanner.nextInt();
		for(int i=1;i<=100;i++) {
			number.setNumber(i);
			if (number.isArmstrongNumber()) {
				System.out.println(i + " is a ArmStrong Number");
			} else {
				System.out.println(i + " is not a ArmStrong Number");
			}
		}
		
//		scanner.close();
	}
}