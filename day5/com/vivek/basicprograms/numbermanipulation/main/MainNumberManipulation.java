package com.vivek.basicprograms.numbermanipulation.main;

import com.vivek.basicprograms.numbermanipulation.NumberManipulation;

public class MainNumberManipulation {

	public static void main(String[] args) {
		NumberManipulation operation1 = new NumberManipulation();

		System.out.println("Swap Two Variables with Third Variable");
		operation1.setvariable1(10);
		operation1.setvariable2(20);
		System.out.println("Vatiables Before Swap Operation :");
		operation1.printVariable();

		operation1.swapWithThirdVariable();
		System.out.println("Variables After Swap Operation :");
		operation1.printVariable();

		System.out.println();

		NumberManipulation operation2 = new NumberManipulation();
		System.out.println("Swap Two Variables without Third Variable");
		operation2.setvariable1(10);
		operation2.setvariable2(5);
		System.out.println("Vatiables Before Swap Operation :");
		operation2.printVariable();

		operation2.swapWithoutThirdVariable();
		System.out.println("Vatiables After Swap Operation :");
		operation2.printVariable();

		System.out.println();

		NumberManipulation operation3 = new NumberManipulation();
		System.out.println("Swap Two Variables without Third Variable Using XOR");
		operation3.setvariable1(2);
		operation3.setvariable2(3);
		System.out.println("Vatiables Before Swap Operation :");
		operation3.printVariable();

		operation3.swapWithoutThirdVariableWithXOR();
		System.out.println("Vatiables After Swap Operation :");
		operation3.printVariable();
	}

}
