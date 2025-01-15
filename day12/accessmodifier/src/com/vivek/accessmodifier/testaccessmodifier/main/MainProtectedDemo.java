package com.vivek.accessmodifier.testaccessmodifier.main;

import com.vivek.accessmodifier.testaccessmodifier.ProtectedDemo;

public class MainProtectedDemo extends ProtectedDemo{

	public static void main(String[] args) {
		
		MainProtectedDemo demo= new MainProtectedDemo();
		
		demo.message="Vivek";
		demo.printProtectedDemoMessage();
	}

}
