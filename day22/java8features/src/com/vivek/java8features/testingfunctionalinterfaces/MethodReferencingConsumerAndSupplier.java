package com.vivek.java8features.testingfunctionalinterfaces;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

import com.vivek.java8features.testingfunctionalinterfaces.entities.Fan;

public class MethodReferencingConsumerAndSupplier {
	public static void main(String[] args) {
		Fan fan1 = new Fan();
//		Consumer<String> fanColorConsumer = color -> fan1.setColor(color);
		Consumer<String> fanColorConsumer = fan1::setColor;
		fanColorConsumer.accept("Orange");
		Supplier<String> fanColorSupplier = fan1::getColor;
		String fanColor = fanColorSupplier.get();
		System.out.println(fanColor);

		//Assignment1
		DoubleSupplier a = () -> Math.random();
		System.out.println(a.getAsDouble() * 100);

		//Assignment2
		Consumer<Integer> fanSpeedConsumer = fan1::setSpeed;
		fanSpeedConsumer.accept(200);
		Supplier<Integer> fanSpeedSupplier = fan1::getSpeed;
		int fanSpeed = fanSpeedSupplier.get();
		System.out.println(fanSpeed);
	}
}
