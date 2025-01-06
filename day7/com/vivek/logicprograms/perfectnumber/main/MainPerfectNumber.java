package com.vivek.logicprograms.perfectnumber.main;

import java.util.Scanner;
import com.vivek.logicprograms.perfectnumber.PerfectNumber;

public class MainPerfectNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int variable = scanner.nextInt();

        if (variable <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            PerfectNumber number = new PerfectNumber(variable);

            if (number.isPerfectNumber()) {
                System.out.println(variable + " is a Perfect Number");
            } else {
                System.out.println(variable + " is Not a Perfect Number");
            }
        }

        scanner.close();
    }
}