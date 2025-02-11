package com.vivek.generics.main;

import com.vivek.generics.classes.GenericClass;
import com.vivek.generics.classes.IntegerClass;
import com.vivek.generics.classes.StringClass;

public class PreGenericExample {

	public static void main(String[] args) {
		IntegerClass integerData = new IntegerClass();
		integerData.setVar1(10);

		int result = integerData.getVar1();
		System.out.println(result);

		StringClass stringData = new StringClass();
		stringData.setName("Vivek");
		String name = stringData.getName();
		System.out.println(name);

		GenericClass<Integer> intData = new GenericClass<>();
		intData.setT(20);
		int res = intData.getT();
		System.out.println(res);

		GenericClass<String> strData = new GenericClass<>();
		strData.setT("Vishal");
		String name1 = strData.getT();
		System.out.println(name1);
	}

}
