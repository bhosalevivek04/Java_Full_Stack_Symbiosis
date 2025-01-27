package com.vivek.oops.inheritance.subclasses;

import com.vivek.oops.inheritance.abstractclass.Bill;

public class DomesticBill extends Bill {
	public DomesticBill(int unit) {
		super(unit);
	}

	@Override
	public float generateBill(int unit) {
		return unit * 1.5f;
	}
}
