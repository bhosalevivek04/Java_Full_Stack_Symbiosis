package com.vivek.collection.queue.blockingqueue.customerservice;

import java.util.concurrent.LinkedBlockingQueue;

import com.vivek.collection.queue.blockingqueue.customerservice.entities.ServiceCall;

public class MainService {

	public static void main(String[] args) {
		LinkedBlockingQueue<ServiceCall> callQueue = new LinkedBlockingQueue<>();
		ServiceCall[] callArray = { new ServiceCall(1, "Vivek"), new ServiceCall(2, "Vishal"),
				new ServiceCall(3, "Navnath"), new ServiceCall(4, "Manas"), new ServiceCall(5, "Pratik"),
				new ServiceCall(6, "Suyash"), new ServiceCall(7, "Rushi"), new ServiceCall(8, "Komal"),
				new ServiceCall(9, "Sakshi"), new ServiceCall(10, "Bharti"),

		};

		Thread caller = new Thread(() -> {
			try {
				for (ServiceCall call : callArray) {
					callQueue.put(call);
					System.out.println("Ongoing Call : " + call);
					Thread.sleep(200);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread customerServiceRepresentative = new Thread(() -> {
			try {
				for (int i = 0; i < callArray.length; i++) {
					System.out.println("Processed Call : " + callQueue.take());
					Thread.sleep(1500);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		caller.start();
		customerServiceRepresentative.start();

	}

}
