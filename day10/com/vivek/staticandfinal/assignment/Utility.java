package com.vivek.staticandfinal.assignment;

public class Utility {
	final static double PI = 3.14;
	
	public static double addition(double number1,double number2) {
		return number1+number2;
	}
	
	public static double substraction(double number1,double number2) {
		return number1-number2;
	}
	
	public static double multiplication(double number1,double number2) {
		return number1*number2;
	}
	
	
	public static double division(double number1,double number2) {
		if(number2 == 0) {
			return -1;
			
		}
		return number1/number2;
	}
	
	public static double modulo(double number1,double number2) {
		if(number2 == 0) {
			return -1;
			
		}
		return number1%number2;
	}
	
	
	public static double power(double number1,double number2) {
		double pow = 1;
		
		if(number2 == 0) {
			return 1;
			
		}
		
		for(int i = 0;i<number2;i++) {
			pow = number1*pow;
		}
		
		return pow;
	}
	
	public static double calculateAreaOfCircle(double radius) {
		return PI*radius*radius;
	}
	
	public static double calculateCircumferenceOfCircle(double radius) {
		return PI*radius*2;
	
	
	}
	

	public static double calculateAreaOfRectangle(double l,double b) {
		return l*b;
	}
	
	public static double calculatePerimeterOfRectangle(double l,double b) {
		return 2*(l+b);
	}

}

