package com.vivek.logicprograms.perfectnumber.main;

// import java.util.Scanner;
import com.vivek.logicprograms.perfectnumber.PerfectNumber;

public class MainPerfectNumber {

	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int variable = scanner.nextInt();

		PerfectNumber number = new PerfectNumber();
		for (int i = 1; i <= 100; i++) {
			number.setNumber(i);
			if (number.isPerfectNumber()) {
				System.out.println(i + " is a Perfect Number");
			} else {
				System.out.println(i + " is Not a Perfect Number");
			}
		}

//        scanner.close();
	}
}