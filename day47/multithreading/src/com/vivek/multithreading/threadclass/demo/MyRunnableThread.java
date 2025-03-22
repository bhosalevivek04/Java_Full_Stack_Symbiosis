package com.vivek.multithreading.threadclass.demo;

public class MyRunnableThread implements Runnable {
	private int no;

	public MyRunnableThread(int no) {
		this.no = no;
	}

	public void printTable() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(no + " x " +i+ " = " + no * i);
		}
	}

	@Override
	public void run() {
		printTable();
	}

}
