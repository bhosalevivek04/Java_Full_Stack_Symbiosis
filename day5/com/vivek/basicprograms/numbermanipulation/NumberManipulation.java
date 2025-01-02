package com.vivek.basicprograms.numbermanipulation;

public class NumberManipulation {
	int variable1;
	int variable2;

	public NumberManipulation() {
		variable1 = 0;
		variable2 = 0;
	}

	public NumberManipulation(int variable1, int variable2) {
		this.variable1 = variable1;
		this.variable2 = variable2;
	}

	public void setvariable1(int variable1) {
		this.variable1 = variable1;
	}

	public void setvariable2(int variable2) {
		this.variable2 = variable2;
	}
	
	public int getVariable1() {
		return variable1;
	}
	
	public int getVariable2() {
		return variable2;
	}

	public void printVariable() {
		System.out.println("Variable1 :" + variable1);
		System.out.println("Variable2 :" + variable2);
	}

	public void swapWithThirdVariable() {
		int temp = variable1;
		variable1 = variable2;
		variable2 = temp;
	}
	
	public void swapWithoutThirdVariable() {
		variable1=variable1 + variable2;
		variable2=variable1 - variable2;
		variable1=variable1 - variable2;
	}
	public void swapWithoutThirdVariableWithXOR() {
		variable1=variable1 ^ variable2;
		variable2=variable1 ^ variable2;
		variable1=variable1 ^ variable2;
	}
}
