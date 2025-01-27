package com.vivek.oops.inheritance.main;

import com.vivek.oops.inheritance.subclasses.DomesticBill;
import com.vivek.oops.inheritance.subclasses.IndustrialBill;

public class MainBill {

	public static void main(String[] args) {
		DomesticBill domesticBill = new DomesticBill(100);
		int domesticUnit = domesticBill.getUnits();
		System.out.println("Domestic Bill: " + domesticBill.generateBill(domesticUnit));

		IndustrialBill industrialBill = new IndustrialBill(200);
		int industrialUnit = industrialBill.getUnits();
		System.out.println("Industrial Bill: " + industrialBill.generateBill(industrialUnit));

	}

}
