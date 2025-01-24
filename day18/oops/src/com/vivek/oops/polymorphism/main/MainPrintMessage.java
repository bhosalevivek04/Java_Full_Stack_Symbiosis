package com.vivek.oops.polymorphism.main;

import com.vivek.oops.polymorphism.subclass.NumericMessage;
import com.vivek.oops.polymorphism.superclass.PrintMessage;

public class MainPrintMessage {

	public static void main(String[] args) {
		PrintMessage pMessage = new PrintMessage();
		NumericMessage nMessage = new NumericMessage();
		pMessage.setMsg("Vivek");
		nMessage.setMsg(9);
//		pMessage.getObj();
		System.out.println(pMessage.getMsg());
		System.out.println(nMessage.getMsg());
	}

}
