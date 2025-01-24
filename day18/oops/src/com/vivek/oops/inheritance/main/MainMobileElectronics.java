package com.vivek.oops.inheritance.main;

import com.vivek.oops.inheritance.subsubclasses.Mobile;

public class MainMobileElectronics {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.setOs("Android");
		mobile.setName("Mobile Phone");
		System.out.println(mobile.getOs());
		System.out.println(mobile.getName());

	}

}
