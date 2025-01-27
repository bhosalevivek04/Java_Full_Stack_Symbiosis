package com.vivek.oops.interfacedemos;

//interface name should contains adjective
@FunctionalInterface
public interface Calculator {
	public final static int VAR = 100;

//	int VAR=100; //compile time it will add public static final
	public abstract int calculate(int number1, int number2);
//	void calculate();// same

	public default void printMessage(String message) {
		printMyMessage(message);
	}

	private void printMyMessage(String message) {
		System.out.println(message);
	}

	public static void printVar() {
		System.out.println(VAR);
	}
}
