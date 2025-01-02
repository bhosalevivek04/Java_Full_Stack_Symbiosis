package com.vivek.basicprograms.shapes;

public class Circle {
	float radius;
	float pi = 3.14F;

	public Circle() {
		radius = 1F;
	}

	public Circle(float radius) {
		this.radius = radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public float calculateCircleArea() {
		return pi * radius * radius;
	}

	public float calculateCircumference() {
		return 2 * pi * radius;
	}
}
