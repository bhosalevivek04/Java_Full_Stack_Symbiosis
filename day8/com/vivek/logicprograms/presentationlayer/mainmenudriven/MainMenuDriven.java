package com.vivek.logicprograms.presentationlayer.mainmenudriven;

import java.util.Scanner;

import com.vivek.logicprograms.presentationlayer.Helper;

public class MainMenuDriven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Helper helper = new Helper();
		int option;
		do {
			option = helper.printMenu(scanner);
			System.out.println(option);
			switch (option) {
			case 1:
				helper.checkPallindrome(scanner);
				break;
			case 2:
				helper.checkArmStrong(scanner);
				break;
			case 3:
				helper.checkPerfect(scanner);
				break;
			case 4:
				helper.checkPrime(scanner);
				break;
			case 5:
				helper.reverseString(scanner);
				break;
			case 6:
				helper.reverseStringLine(scanner);
				break;
			case 7:
				helper.characterCounting(scanner);
				break;
			case 8:
				helper.printFibonacciSeries(scanner);
				break;
			case 9:
				helper.printQubeSquareSeries(scanner);
				break;
			case 10:
				helper.printAlternativeSeries(scanner);
				break;
			case 11:
				helper.printCharSeries(scanner);
				break;
			case 12:
				helper.printPattern1(scanner);
				break;
			case 0:
				System.out.println("Bye...");
				break;
			default:
				System.out.println("Invalid Input");
			}
			System.out.println();
		} while (option != 0);
		scanner.close();
	}
}