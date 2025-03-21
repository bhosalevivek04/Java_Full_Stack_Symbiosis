package com.vivek.collection.map.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.vivek.collection.map.hashmap.entities.Student;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, Float> studentRecord = new TreeMap<>();
		studentRecord.put("Vivek", 70000F);
		studentRecord.put("Ashish", 75000F);

		Comparator<Student> rollNoComparator = (s1, s2) -> s1.getRollNo() - s2.getRollNo();
		studentRecord.forEach((k, v) -> System.out.println(k + " -> " + v));

		Map<Student, Float> studentRecord1 = new TreeMap<>(rollNoComparator);
		studentRecord1.put(new Student(1, "Vivek"), 70000F);
		studentRecord1.put(new Student(2, "Ashish"), 75000F);
		studentRecord1.forEach((k, v) -> System.out.println(k + " -> " + v));

	}
}
