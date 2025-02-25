package com.vivek.cartserviceminiproject;

import java.util.LinkedList;
import java.util.Scanner;

import com.vivek.cartserviceminiproject.entities.Cart;
import com.vivek.cartserviceminiproject.entities.Product;
import com.vivek.cartserviceminiproject.utilities.CartUtility;
import com.vivek.cartserviceminiproject.utilities.CartUtilityImp;
import com.vivek.cartserviceminiproject.utilities.ProductUtility;
import com.vivek.cartserviceminiproject.utilities.ProductUtilityImp;

public class App {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int choice = 0;
			Cart cart = new Cart(new LinkedList<>());
			Product product = new Product();
			CartUtility cartUtilt = new CartUtilityImp(cart, product);
			ProductUtility productUtil = new ProductUtilityImp(product);
			do {
				System.out.println("Main Menu");
				System.out.println("	1. Cart");
				System.out.println("	2. Product");
				System.out.println("	0. Exit");

				choice = scanner.nextInt();
				switch (choice) {
				case 1 -> cartUtilt.manipulateCart(scanner);
				case 2 -> productUtil.manipulateProduct(scanner);
				case 0 -> System.out.println("Bye.. Bye..");
				default -> System.out.println("Invalid Input");
				}
			} while (choice != 0);
		}
	}
}