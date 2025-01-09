package com.vivek.staticandfinal.emplyoeedemo;

public class EmplyoeeDemo{
	String employeeName;
	float employeeSalary;
	final int RETIREMENT_AGE;
	static String organizationName;
	public static int counter;
	
	


	public EmplyoeeDemo(String employeeName, float employeeSalary, int rETIREMENT_AGE) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		RETIREMENT_AGE = rETIREMENT_AGE;
		counter++;
	}
	
	

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public static String getOrganizationName() {
		return organizationName;
	}
	public static void setOrganizationName(String organizationName) {
		EmplyoeeDemo.organizationName = organizationName;
	}
	public int getRETIREMENT_AGE() {
		return RETIREMENT_AGE;
	}
	

	public static int getCounter() {
		return counter;
	}



	public static void setCounter(int counter) {
		EmplyoeeDemo.counter = counter;
	}

	
	@Override
	public String toString() {
		return "EmplyoeeDemo [employeeName=" + employeeName + ", employeeSalary=" + employeeSalary + ", RETIREMENT_AGE="
				+ RETIREMENT_AGE + " ,organisationName = "+organizationName+"]";
	}

	

}
