package com.vivek.oops.inheritance.subsubclasses;

import com.vivek.oops.inheritance.subclasses.Electronics;

public class Mobile extends Electronics{
	String os;
	int ram;
	int storage;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String os, int ram, int storage) {
		super();
		this.os = os;
		this.ram = ram;
		this.storage = storage;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	
}
