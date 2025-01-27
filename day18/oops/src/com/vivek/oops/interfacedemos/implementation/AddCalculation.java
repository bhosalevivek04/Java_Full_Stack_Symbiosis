package com.vivek.oops.interfacedemos.implementation;

import com.vivek.oops.interfacedemos.Calculator;

public class AddCalculation implements Calculator {

	@Override
	public int calculate(int number1, int number2) {

		return number1 + number2;
	}

}
