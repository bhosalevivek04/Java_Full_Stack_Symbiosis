package com.vivek.java8features.streamapi;

import java.util.Comparator;
import java.util.stream.Stream;

public class TestStreamApi {

	public static void main(String[] args) {
//		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		IntStream intStream = Arrays.stream(intArray);
//		Stream<Integer> intStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		intStream.filter(no -> no % 2 == 0).forEach(System.out::println);

//		Stream<String> stringStream = Stream.of("Vivek", "Jayesh", "Navnath", "Jay", "Tejas");
//
//		stringStream.filter(ch -> ch.charAt(0) == 'J' || ch.charAt(0) == 'j')
//        .map(name -> name.length() % 2 == 0 ? name : null)
//        .filter(name -> name != null)
//        .forEach(System.out::println);

//		Stream<Integer> intStream = Stream.of(3, 4, 5, 1, 2, 6, 7, 8, 9, 10);
//		intStream.sorted().forEach(System.out::println);

		Stream<String> nameStream = Stream.of("Vivek", "Jayesh", "Navnath", "Jay", "Tejas");
		nameStream.filter(name -> name.charAt(0) == 'J' || name.charAt(0) == 'j').sorted(Comparator.reverseOrder())
				.forEach(var -> System.out.println(var));

	}

}
