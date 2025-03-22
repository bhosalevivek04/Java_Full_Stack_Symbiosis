package com.vivek.multithreading.threadclass.demo;

public class MainMyRunnableThread {
	public static void main(String[] args) {
		MyRunnableThread iThread1 = new MyRunnableThread(25);
		MyRunnableThread iThread2 = new MyRunnableThread(12);

		Thread obj = new Thread(new Runnable() { // Anonymous Class
			public void run() {
//				System.out.println("Hello");
			}
		});
//		obj.start();

		Thread thread1 = new Thread(iThread1);
		Thread thread2 = new Thread(iThread2);
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(5);

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
}
