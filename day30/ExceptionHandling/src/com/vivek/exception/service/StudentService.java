package com.vivek.exception.service;

import com.vivek.exception.dao.StudentDao;
import com.vivek.exception.entities.Student;

public class StudentService {
	public String insert(Student student) throws Exception{
		if(student.getAge()<=18) {
			throw(new RuntimeException("Invaid Age..."));
		}
		
		StudentDao studentDao=new StudentDao();
		return studentDao.insert(student);
	}
}
