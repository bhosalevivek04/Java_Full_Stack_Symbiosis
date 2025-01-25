package com.vivek.oops.polymorphism.subclass;

import com.vivek.oops.polymorphism.superclass.PrintMessage;

public class NumericMessage extends PrintMessage {
	private int msg;

	public NumericMessage() {
	}

	public NumericMessage(int msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg + "";
	}

	public void setMsg(int msg) {
		this.msg = msg;
	}

	@Override
	public NumericMessage getObj() throws Exception {
		return new NumericMessage();
	}
}
