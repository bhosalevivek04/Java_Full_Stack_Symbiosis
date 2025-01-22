package com.vivek.arrays.objectarray.main;

import com.vivek.arrays.objectarray.Student;

public class MainStudent {
	public static void main(String[] args) {
		Student[] studentArray = new Student[5];
		studentArray[0]=new Student();
		studentArray[0].setName("Vivek");
		System.out.println(studentArray[0].getName());
	}
}
