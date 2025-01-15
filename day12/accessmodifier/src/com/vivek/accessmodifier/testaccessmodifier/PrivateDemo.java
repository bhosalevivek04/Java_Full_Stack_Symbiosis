package com.vivek.accessmodifier.testaccessmodifier;

public class PrivateDemo {
	private int variable;
	private String message;

//	String message;

//	private PrivateDemo() {     //no use
//
//	}

	public PrivateDemo() {

	}

	public void printPrivateDemoMessage() {
		System.out.println(message);
	}

	private class InnerClass {

	}
}
