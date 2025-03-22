package com.vivek.collection.collections.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vivek.collection.collections.example.entities.Book;

public class CollectionsDemo {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add("DBC");
		nameList.add("BBC");
		nameList.add("ABC");
		nameList.add("CBC");

		Collections.sort(nameList);
		nameList.forEach(System.out::println);

		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("Java", 500));
		bookList.add(new Book("C", 300));
		bookList.add(new Book("Python", 400));
		bookList.add(new Book("Who move my Cheese", 150));

//		Collections.sort(bookList, (b1, b2) -> b1.getName().compareTo(b2.getName()));
		int result = Collections.binarySearch(bookList, new Book("Who move my Cheese", 150),
				(b1, b2) -> b1.getName().compareTo(b2.getName()));
		System.out.println(result);
//		bookList.forEach(System.out::println);

//		List<Book> synBookList = Collections.synchronizedList(bookList);
		List<Book> unModifierBookList = Collections.unmodifiableList(bookList);
//		unModifierBookList.forEach(System.out::println);
		System.out.println(Collections.min(unModifierBookList, (b1, b2) -> (int) (b1.getPrice() - b2.getPrice())));
		
		System.out.println(Collections.min(unModifierBookList, (b1, b2) -> Float.compare(b1.getPrice(), b2.getPrice())));
		System.out.println(Collections.max(unModifierBookList, (b1, b2) -> Float.compare(b1.getPrice(), b2.getPrice())));

	}
}
