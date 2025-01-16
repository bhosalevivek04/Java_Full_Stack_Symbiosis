package com.vivek.recursion.demo;

public class RecursionDemo {
	private int variable;

	public RecursionDemo() {
	}

	public RecursionDemo(int variable) {
		this.variable = variable;
	}

	public int getVariable() {
		return variable;
	}

	public void setVariable(int variable) {
		this.variable = variable;
	}

	public void printVariable(int number) {
		if (--number > 0) {
			printVariable(number);
		}
		System.out.println(number);
	}

	@Override
	public String toString() {
		return "RecursionDemo [variable=" + variable + "]";
	}

}
