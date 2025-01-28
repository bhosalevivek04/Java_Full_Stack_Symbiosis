package com.vivek.java8features.testingfunctionalinterfaces;

import java.util.function.Consumer;

import com.vivek.java8features.testingfunctionalinterfaces.entities.ConsumerObject;
import com.vivek.java8features.testingfunctionalinterfaces.entities.Fan;

public class TestConsumerInterface {
	public static void main(String[] args) {

		ConsumerObject.stringConsumer.accept("Vivek");

		ConsumerObject.intConsumer.accept(9);

		Fan fan1 = new Fan("White", 3);
		ConsumerObject.fanConsumer.accept(fan1);
	}
}
