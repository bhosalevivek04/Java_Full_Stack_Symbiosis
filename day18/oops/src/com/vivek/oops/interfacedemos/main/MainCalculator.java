package com.vivek.oops.interfacedemos.main;

import com.vivek.oops.interfacedemos.Calculator;
import com.vivek.oops.interfacedemos.implementation.AddCalculation;
import com.vivek.oops.interfacedemos.implementation.DivideCalculation;
import com.vivek.oops.interfacedemos.implementation.MultiplyCalculation;
import com.vivek.oops.interfacedemos.implementation.SubstractCalculation;

public class MainCalculator {
	public static void main(String[] args) {
		Calculator add = new AddCalculation();
		add.printMessage("Addition");
		add.printMessage(add.calculate(20, 30) + "");

		Calculator sub = new SubstractCalculation();
		sub.printMessage("Substraction");
		sub.printMessage(sub.calculate(30, 20) + "");

		Calculator mul = new MultiplyCalculation();
		mul.printMessage("Multiplication");
		mul.printMessage(mul.calculate(5, 4) + "");

		Calculator div = new DivideCalculation();
		div.printMessage("Divide");
		div.printMessage(div.calculate(4, 2) + "");

//		Calculator mod = new Calculator() { //Anonymous Class use for one time use
//			@Override
//			public int calculate(int number1, int number2) {
//				return number1 % number2;
//			}
//		};
		Calculator mod = (number1, number2) -> number1 % number2; //lamda expression used when single abstract method in interface

		mod.printMessage("Modulus");
		mod.printMessage(mod.calculate(3, 2) + "");
	}
}
