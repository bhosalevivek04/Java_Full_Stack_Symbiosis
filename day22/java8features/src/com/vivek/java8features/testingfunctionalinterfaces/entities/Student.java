package com.vivek.java8features.testingfunctionalinterfaces.entities;

public class Student {
	private int marks;

	@Override
	public String toString() {
		return "Student [marks=" + marks + "]";
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int marks) {
		super();
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
