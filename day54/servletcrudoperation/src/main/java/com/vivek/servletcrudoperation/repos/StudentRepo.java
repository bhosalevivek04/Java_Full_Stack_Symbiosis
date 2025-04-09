package com.vivek.servletcrudoperation.repos;

import java.util.List;

import com.vivek.servletcrudoperation.controllers.entities.Student;

public interface StudentRepo {
	String add(Student student);

	List<Student> fetchAll();
}
