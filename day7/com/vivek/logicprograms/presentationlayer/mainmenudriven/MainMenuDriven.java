package com.vivek.logicprograms.presentationlayer.mainmenudriven;

import java.util.Scanner;

import com.vivek.logicprograms.presentationlayer.Helper;

public class MainMenuDriven {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Helper helper = new Helper();
		int option;
		do {
			option=helper.printMenu(scanner);
			System.out.println(option);
			switch(option) {
			case 1: helper.checkPallindrome(scanner);
			break;
			case 2: helper.checkArmStrong(scanner);
			break;
			case 3: helper.checkPerfect(scanner);
			break;
			case 4: helper.checkPrime(scanner);
			break;
			case 0: System.out.println("Bye...");
			break;
			default:System.out.println("Invalid Input");
			}
		}while(option!=0);
		scanner.close();
	}
}
