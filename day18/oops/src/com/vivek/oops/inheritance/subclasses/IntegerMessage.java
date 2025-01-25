package com.vivek.oops.inheritance.subclasses;

import com.vivek.oops.inheritance.abstractclass.PrintMessage;

public abstract class IntegerMessage extends PrintMessage{
	private int var;

	public IntegerMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IntegerMessage(int var) {
		super();
		this.var = var;
	}

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}
	
	public void print() {
		System.out.println(var);
	}
}
