package com.vivek.servletcrudoperation.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.vivek.servletcrudoperation.controllers.entities.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public String add(Student student) throws ClassNotFoundException, SQLException {
		String msg = "";
		Connection connection = getConnection();
		try (PreparedStatement statement = connection
				.prepareStatement("INSERT INTO STUDENT(roll_no,name,age) values(?,?,?)");)
		{
			statement.setInt(1, student.getRollNo());
			statement.setString(2, student.getName());
			statement.setInt(3, student.getAge());
			if (statement.executeUpdate() > 0d) {
				msg = "Record Inserted Successfully";
			} else {
				msg = "Error occured while insertion record";
			}
		}
		return msg;
	}

	@Override
	public List<Student> fetchAll() {
		// TODO Auto-generated method stub
		return null;
	}

	private Connection getConnection() throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/preccrud", "root", "Vivek@123");
	}
}
