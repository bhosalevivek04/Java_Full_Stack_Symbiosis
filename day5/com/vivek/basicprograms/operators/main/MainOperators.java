package com.vivek.basicprograms.operators.main;

import com.vivek.basicprograms.operators.Operators;

public class MainOperators {
	public static void main(String[] args) {
		Operators operator1 = new Operators();
		operator1.setNumber1(10);
		operator1.setNumber2(6);

		int Number1 = operator1.getNumber1();
		System.out.println("Number1 :" + Number1);

		int Number2 = operator1.getNumber2();
		System.out.println("Number2 :" + Number2);

		int leftShift = operator1.performLeftShiftNumber1(1);
		System.out.println("Left Shift on Number1:" + leftShift);

		int RightShift = operator1.performUnsignRightShiftNumber1(1);
		System.out.println("Right Shift on Number1:" + RightShift);

		int addition = operator1.performAddition();
		System.out.println("Addition :" + addition);
	}
}
