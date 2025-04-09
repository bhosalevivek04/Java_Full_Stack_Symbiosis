package com.vivek.servletcrudoperation.controllers.entities;

public class Address {
	private int id;
	private String area;
	private String city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String area, String city) {
		super();
		this.id = id;
		this.area = area;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", area=" + area + ", city=" + city + "]";
	}

}
