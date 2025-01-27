package com.vivek.oops.inheritance.abstractclass;

public abstract class Bill {
	int units;

	public Bill(int unit) {
		this.units = unit;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public abstract float generateBill(int unit);
}
