package com.vivek.collection.map.hashmap.entities;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int rollNo;
	private String name;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null && obj.getClass() != this.getClass()) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		Student temp = (Student) obj;
		return temp.rollNo == this.rollNo && temp.name.equals(this.name);

	}

	@Override
	public int hashCode() {
//		int hash = 17;
//		hash = hash * 13 + rollNo;
//		
		return Objects.hash(rollNo, name);
	}

	@Override
	public int compareTo(Student student) {
		return this.name.compareTo(student.name);
	}
}
