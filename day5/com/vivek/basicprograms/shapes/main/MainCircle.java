package com.vivek.basicprograms.shapes.main;

import com.vivek.basicprograms.shapes.Circle;

public class MainCircle {
	public static void main(String[] args) {
		Circle circle1=new Circle();
		circle1.setRadius(3.5F);
		float radius=circle1.getRadius();
		System.out.println("Radius: "+radius);

		float areaOfCircle=circle1.calculateCircleArea();
		System.out.println("Area Of Circle: "+areaOfCircle);
		
		float circumference=circle1.calculateCircumference();
		System.out.println("Circumference Of Circle: "+circumference);
		
	}
}
