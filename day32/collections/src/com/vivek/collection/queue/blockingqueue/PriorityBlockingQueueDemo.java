package com.vivek.collection.queue.blockingqueue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {
	public static void main(String[] args) {
		PriorityBlockingQueue<Integer> intQueue = new PriorityBlockingQueue<>();

		// Consumer
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					intQueue.put(i);
					System.out.println("set: " + i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		;

		// Supplier
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println("get: " + intQueue.take());
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		;

	}

}
