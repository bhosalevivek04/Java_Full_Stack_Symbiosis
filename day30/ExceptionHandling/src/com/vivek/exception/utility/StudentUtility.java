package com.vivek.exception.utility;

import java.util.Scanner;

import com.vivek.exception.customexceptions.InvalidAgeException;
import com.vivek.exception.customexceptions.InvalidNameException;
import com.vivek.exception.entities.Student;
import com.vivek.exception.service.StudentService;

public class StudentUtility {
	public void insert(Scanner scanner) {
		System.out.println("Enter Student Details");
		System.out.println("Enter your Roll No: ");
		int rollNo = scanner.nextInt();
		System.out.println("Enter your Name: ");
		String name = scanner.next();
		System.out.println("Enter your Age: ");
		int age = scanner.nextInt();
		Student student = new Student(rollNo, name, age);
		StudentService studentService = new StudentService();
		try {
			System.out.println(studentService.insert(student));
		} catch (InvalidNameException e) {
			e.getMessage();
		} catch (InvalidAgeException e) {
			e.getMessage();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
