package com.vivek.staticandfinal.finaldemo.main;

import com.vivek.staticandfinal.finaldemo.Holidays;

public class MainHolidays {

	public static void main(String[] args) {
		Holidays diwali = new Holidays("Diwali", 5);
		Holidays dasara = new Holidays("Dasara", 1);

		System.out.println(diwali);
		System.out.println(dasara);
	}

}
