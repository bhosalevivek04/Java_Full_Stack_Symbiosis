package com.vivek.java8features.testingfunctionalinterfaces.entities;

import java.util.function.Consumer;

public class ConsumerObject {
	public static final Consumer<String> stringConsumer = (String name) -> {
		System.out.println(name);
	};
	public static final Consumer<Integer> intConsumer = var -> {
		System.out.println(var);
	};

	public static final Consumer<Fan> fanConsumer = fan -> {
		System.out.println(fan);
	};
}
