package com.vivek.collection.queue.blockingqueue.restaurant;

import java.util.concurrent.ArrayBlockingQueue;

import com.vivek.collection.queue.blockingqueue.restaurant.entities.Orders;

public class App {
	public static void main(String[] args) {
		ArrayBlockingQueue<Orders> orderQueue=new ArrayBlockingQueue<>(3);
		Orders[] orderArray= {
				new Orders(1,"Misal"),
				new Orders(2,"Biryani"),
				new Orders(3,"Panner Masala"),
				new Orders(4,"Panner Tikka Masala"),
				new Orders(5,"Veg Kolhapuri"),
				new Orders(6,"Shev Bhaji")
			};
		
			Thread waiter = new Thread(() -> {
				try {
					for (Orders order : orderArray) {
						orderQueue.put(order);
						System.out.println("Order Placed: " + order);
						Thread.sleep(500);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});

			Thread chef = new Thread(() -> {
				try {
					for (int i = 0; i < 10; i++) {
						System.out.println("Order Completed: " + orderQueue.take());
						Thread.sleep(2000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});

			waiter.start();
			chef.start();
		}
	}
