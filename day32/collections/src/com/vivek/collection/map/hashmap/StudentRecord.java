package com.vivek.collection.map.hashmap;

import java.util.HashMap;

import com.vivek.collection.map.hashmap.entities.Student;

public class StudentRecord {
	public static void main(String[] args) {
		StudentRecord demo = new StudentRecord();
		HashMap<Student, Float> studentRecords = new HashMap<>(); // duplicates entry not allowed
		studentRecords.put(new Student(1, "Vivek"), 60000F);
		studentRecords.put(new Student(2, "Ashish"), 60000F);
		studentRecords.put(new Student(3, "Navnath"), 60000F);
		studentRecords.put(new Student(4, "Aayush"), 60000F);

//		studentRecords.forEach(StudentRecord::printRecords); //with static
		studentRecords.forEach(demo::printRecords); // without static
	}

	public void printRecords(Student student, Float fees) {
//	public static void printRecords(Student student, Float fees) {
		System.out.println(student + " -> " + fees);
	}
}
