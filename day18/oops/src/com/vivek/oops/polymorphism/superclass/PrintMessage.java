package com.vivek.oops.polymorphism.superclass;

public class PrintMessage {
	private String msg;

	public PrintMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrintMessage(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public PrintMessage getObj() throws IndexOutOfBoundsException {
		return new PrintMessage();
	}
}
