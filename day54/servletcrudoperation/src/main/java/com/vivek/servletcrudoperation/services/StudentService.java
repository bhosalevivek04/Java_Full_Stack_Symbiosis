package com.vivek.servletcrudoperation.services;

import java.sql.SQLException;
import java.util.List;

import com.vivek.servletcrudoperation.controllers.entities.Student;

public interface StudentService {
	String add(Student student) throws ClassNotFoundException, SQLException;

	List<Student> fetchAll();
}
