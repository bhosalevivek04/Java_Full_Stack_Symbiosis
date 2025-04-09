package com.vivek.servletcrudoperation.controllers;

import java.io.IOException;

import com.vivek.servletcrudoperation.controllers.entities.Address;
import com.vivek.servletcrudoperation.controllers.entities.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterStudentController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int rollNo = Integer.parseInt(req.getParameter("student_roll_no"));
		String name = req.getParameter("student_name");
		int age = Integer.parseInt(req.getParameter("student_age"));
		String area = req.getParameter("address_area");
		String city = req.getParameter("address_city");

		Student student = new Student();
		student.setRollNo(rollNo);
		student.setName(name);
		student.setAge(age);

		Address address = new Address();
		address.setArea(area);
		student.setAddress(address);
		System.out.println(student);
	}
}
