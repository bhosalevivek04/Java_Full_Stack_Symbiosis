package com.vivek.multithreading.executorservices.threads;

import java.util.concurrent.ThreadFactory;

public class Tasks implements ThreadFactory{

	private int no;
	
	
	public Tasks(int no) {
		super();
		this.no = no;
	}


	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public Thread newThread(Runnable r) {
		Thread thread1=new Thread();
		return null;
	}

}
