package com.vivek.cartserviceminiproject.utilities;

import java.util.Scanner;

public interface CartUtility {
	int printMenu(Scanner scanner);
	void manipulateCart(Scanner scanner);
	void add(Scanner scanner);
	void delete(Scanner scanner);
	void update(Scanner scanner);
	void print();
}