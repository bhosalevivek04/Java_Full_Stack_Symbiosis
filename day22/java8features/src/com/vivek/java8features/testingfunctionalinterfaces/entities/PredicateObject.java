package com.vivek.java8features.testingfunctionalinterfaces.entities;

import java.util.function.Predicate;

public class PredicateObject {
	public static final Predicate<Fan> validateFan = fan -> {
		return fan.getColor().matches("[A-Z][a-z]+") && fan.getColor().length() >= 3 && fan.getSpeed() > 0;
	};

	public static final Predicate<Student> validateMarks = student -> {
		return student.getMarks() > 35;
	};
}
