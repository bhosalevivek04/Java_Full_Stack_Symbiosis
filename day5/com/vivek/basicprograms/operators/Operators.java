package com.vivek.basicprograms.operators;

public class Operators {
	int number1;
	int number2;

	public Operators() {
		number1 = 0;
		number2 = 0;
	}

	public Operators(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	public int performAddition() {
		return number1 + number2;
	}

	public int performSubstraction() {
		return number1 - number2;
	}

	public int performMultiplication() {
		return number1 * number2;
	}

	public int performDivision() {
		return number1 / number2;
	}

	public int performModulus() {
		return number1 % number2;
	}

	public int perfromAndOperation() {
		return number1 & number2;
	}

	public int perfromOROperation() {
		return number1 | number2;
	}

	public int perfromXOROperation() {
		return number1 ^ number2;
	}

	public int performRightShiftNumber1(int shiftBit) {
		return number1 >> shiftBit;
	}

	public int performLeftShiftNumber1(int shiftBit) {
		return number1 << shiftBit;
	}

	public int performUnsignRightShiftNumber1(int shiftBit) {
		return number1 >>> shiftBit;
	}
}
//perform addition