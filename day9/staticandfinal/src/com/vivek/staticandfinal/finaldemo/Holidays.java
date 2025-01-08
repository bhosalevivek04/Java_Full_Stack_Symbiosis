package com.vivek.staticandfinal.finaldemo;

public final class Holidays {
	final String FESTIVAL;
	final int NO_OF_LEAVES;

	public Holidays(String festival, int noOfLeaves) {
		this.FESTIVAL = festival;
		this.NO_OF_LEAVES = noOfLeaves;
	}

	public final String getFestival() {
		return FESTIVAL;
	}

	public int getNoOfLeaves() {
		return NO_OF_LEAVES;
	}

	@Override
	public String toString() {
		return "Holidays{festival: " + FESTIVAL + ", No. of Leaves: " + NO_OF_LEAVES + "}";
	}
}
