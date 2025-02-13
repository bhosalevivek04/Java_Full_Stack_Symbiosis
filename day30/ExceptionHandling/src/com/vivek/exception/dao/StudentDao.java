package com.vivek.exception.dao;

import com.vivek.exception.entities.Student;

public class StudentDao {
	public String insert(Student student) throws Exception {

		Integer intVar = 10;
		Object objInt = intVar;
//		try {
//			Double result = (Double) objInt;
//		} catch (ClassCastException e) {
//			throw (new Exception("Casting issue", e));
//		}

		try {
			int result = Integer.parseInt("ABC");
		} catch (NumberFormatException e) {
			throw (new Exception(e.getMessage(), e));
		}

		return "Successfully inserted...";
	}
}
