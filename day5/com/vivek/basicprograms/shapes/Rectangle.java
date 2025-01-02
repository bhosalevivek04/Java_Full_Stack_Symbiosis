package com.vivek.basicprograms.shapes;

public class Rectangle {
	float height;
	float width;
	
	public Rectangle() {
		height = 1F;
		width = 1F;
	}
	
	public Rectangle(float height,float width) {
		this.height = height;
		this.width = width;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getHeight() {
		return height;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getWidth() {
		return width;
	}

	public float calculateArea() {
		return width * height;
	}
}

