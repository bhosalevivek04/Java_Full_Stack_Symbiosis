package com.vivek.generics.main;

import com.vivek.generics.classes.GenericClassForArrays;
import com.vivek.generics.entities.Student;

public class MainGenericClassForArrays {

	public static void main(String[] args) {
		GenericClassForArrays<Integer> intArray = new GenericClassForArrays<>();

		Integer[] intArray1 = { 1, 2, 3, 4, 5 };
		intArray.settArray(intArray1);
		intArray.printArray();

		GenericClassForArrays<String> strArray = new GenericClassForArrays<>();

		String[] strArray1 = { "Vivek", "Vishal", "Navnath" };
		strArray.settArray(strArray1);
		strArray.printArray();

		GenericClassForArrays<Student> stdArray = new GenericClassForArrays<>();
		Student[] stdArray1 = { 
				new Student(9, "Vivek"), 
				new Student(10, "Sonu") 
			};
		stdArray.settArray(stdArray1);
		stdArray.printArray();
	}

}
