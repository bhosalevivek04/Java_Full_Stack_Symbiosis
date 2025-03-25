package com.vivek.multithreading.executorservices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintingMessages {
	public static void main(String[] args) {
		ExecutorService eService= Executors.newFixedThreadPool(3, null);
	}
}
