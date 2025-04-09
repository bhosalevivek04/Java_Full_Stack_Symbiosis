package com.vivek.servletcrudoperation.controllers.entities;

public class Student {
	private int id;
	private int rollNo;
	private String name;
	private int age;
	private Address address;

	@Override
	public String toString() {
		return "Student [id=" + id + ", rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", address=" + address
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(int id, int rollNo, String name, int age, Address address) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
