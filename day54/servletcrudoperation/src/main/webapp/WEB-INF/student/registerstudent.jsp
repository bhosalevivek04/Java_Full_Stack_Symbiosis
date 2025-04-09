<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Register</h1>
	<form action="register" method="POST">
		<label>Student Roll No:</label>
		<input type="text" name="student_roll_no" /></br>
		<label>Student Name:</label>
		<input type="text" name="student_name" /></br>
		<label>Student Age:</label>
		<input type="text" name="student_age" /></br>
		<label>Student Area:</label>
		<input type="text" name="address_area" /></br>
		<label>Student City:</label>
		<input type="text" name="address_city" /></br>
		
		<button type="submit">Register</button>
	</form>
</body>
</html>