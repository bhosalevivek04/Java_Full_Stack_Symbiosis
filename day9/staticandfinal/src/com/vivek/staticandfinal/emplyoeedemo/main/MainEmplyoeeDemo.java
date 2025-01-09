package com.vivek.staticandfinal.emplyoeedemo.main;

import com.vivek.staticandfinal.emplyoeedemo.EmplyoeeDemo;

public class MainEmplyoeeDemo {
	public static void main(String[] args) {
		EmplyoeeDemo.setOrganizationName("APPLE");
		System.out.println("Counter of OBjects are" + EmplyoeeDemo.counter);
		EmplyoeeDemo employee1 = new EmplyoeeDemo("Vivek", 10000000, 58);
		EmplyoeeDemo employee2 = new EmplyoeeDemo("Tejas", 20000000, 48);
		System.out.println("Counter of OBjects are" + EmplyoeeDemo.counter);
		EmplyoeeDemo employee3 = new EmplyoeeDemo("Suyash", 1000000, 58);

		System.out.println("Counter of OBjects are" + EmplyoeeDemo.counter);

		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);

		EmplyoeeDemo.setOrganizationName("SoftNath");

		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);

		System.out.println("Counter of OBjects are" + EmplyoeeDemo.counter);

	}

}
