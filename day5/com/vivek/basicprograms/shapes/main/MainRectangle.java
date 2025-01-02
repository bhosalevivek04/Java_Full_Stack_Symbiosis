package com.vivek.basicprograms.shapes.main;

import com.vivek.basicprograms.shapes.Rectangle;

public class MainRectangle {
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(5.0F);
		rectangle.setWidth(4.0F);
		float area = rectangle.calculateArea();
		System.out.println(area);

		System.out.println();

		Rectangle rectangle1 = new Rectangle(4.0F, 3.0F);
		float area1 = rectangle1.calculateArea();
		System.out.println(area1);

		float height1 = rectangle1.getHeight();
		float width1 = rectangle1.getWidth();
		System.out.println("Height :" + height1 + "\n" + "Width: " + width1);
	}
}