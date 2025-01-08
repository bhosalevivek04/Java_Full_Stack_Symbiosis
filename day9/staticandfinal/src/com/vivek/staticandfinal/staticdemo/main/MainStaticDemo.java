package com.vivek.staticandfinal.staticdemo.main;

import com.vivek.staticandfinal.staticdemo.StaticDemo;

public class MainStaticDemo {

	public static void main(String[] args) {
//		StaticDemo staticDemo = new StaticDemo();
//		staticDemo.setVariable(10);
		
		StaticDemo.setVariable(10);
		int result = StaticDemo.getVariable();
		System.out.println(result);
	}

}
