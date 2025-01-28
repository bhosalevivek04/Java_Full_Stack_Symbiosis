package com.vivek.java8features.testingfunctionalinterfaces;

import com.vivek.java8features.testingfunctionalinterfaces.entities.Fan;
import com.vivek.java8features.testingfunctionalinterfaces.entities.PredicateObject;
import com.vivek.java8features.testingfunctionalinterfaces.entities.Student;

public class TestPredicateInterface {
	public static void main(String[] args) {

		Fan fan = new Fan("White", 9);
		boolean result = PredicateObject.validateFan.test(fan);
		if (result) {
			System.out.println(fan);
		} else {
			System.out.println("Invalid Fan");
		}
		
		Student student1=new Student(30);
		Student student2=new Student(50);
		
		boolean res=PredicateObject.validateMarks.test(student1);
		if(res) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
}
