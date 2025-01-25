package com.vivek.oops.inheritance.main;

import com.vivek.oops.inheritance.subclasses.Demo1;
import com.vivek.oops.inheritance.subclasses.Demo2;

public class MainDemo {

	public static void main(String[] args) {
		Demo1 demo = new Demo2(10);
		demo.print1();

	}

}
