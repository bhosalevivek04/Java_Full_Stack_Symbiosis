package com.vivek.oops.inheritance.subclasses;

import com.vivek.oops.inheritance.abstractclass.Bill;

public class IndustrialBill extends Bill {
	public IndustrialBill(int unit) {
		super(unit);
	}

	@Override
	public float generateBill(int unit) {
		return unit * 2.0f;
	}
}
