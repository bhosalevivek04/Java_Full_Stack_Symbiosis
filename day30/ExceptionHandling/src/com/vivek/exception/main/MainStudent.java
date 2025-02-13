package com.vivek.exception.main;

import java.util.Scanner;

import com.vivek.exception.utility.StudentUtility;

public class MainStudent {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentUtility util = new StudentUtility();
		util.insert(scanner);
		scanner.close();
	}
}
