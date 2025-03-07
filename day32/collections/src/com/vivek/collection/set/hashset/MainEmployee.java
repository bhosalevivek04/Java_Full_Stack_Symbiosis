package com.vivek.collection.set.hashset;

import java.util.HashSet;

import com.vivek.collection.set.hashset.entities.Employee;

public class MainEmployee {
	public static void main(String[] args) {
		HashSet<Employee> employeeRecord = new HashSet<>();

		employeeRecord.add(new Employee(1, "Vivek", 20000));
		employeeRecord.add(new Employee(2, "Vishal", 30000));
		employeeRecord.add(new Employee(3, "Tejas", 40000));
		employeeRecord.add(null);

//		System.out.println(new Employee(1, "Vivek", 20000).hashCode());
//		System.out.println(new Employee(1, "Vivek", 20000).hashCode());
//		System.out.println(new Employee(1, "Vivek", 20000).equals(new Employee(1, "Vivek", 20000)));

		System.out.println(employeeRecord);
	}
}
