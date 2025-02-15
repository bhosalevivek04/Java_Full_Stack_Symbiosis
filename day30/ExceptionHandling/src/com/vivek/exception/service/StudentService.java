package com.vivek.exception.service;

import com.vivek.exception.customexceptions.InvalidAgeException;
import com.vivek.exception.customexceptions.InvalidNameException;
import com.vivek.exception.dao.StudentDao;
import com.vivek.exception.entities.Student;

public class StudentService {
	public String insert(Student student) throws InvalidNameException, Exception {
		if (student.getAge() <= 18) {
			throw (new InvalidAgeException("Invaid Age..."));
		}

		if (!student.getName().matches("[A-Z][a-z]{1,15}")) {
			throw (new InvalidNameException("Invalid Name..."));
		}

		StudentDao studentDao = new StudentDao();
		return studentDao.insert(student);
	}
}
