package com.vivek.generics.main;

import com.vivek.generics.classes.Dictionary;

public class MainDictionary {
	public static void main(String[] args) {
		Dictionary<String, Long>[] phoneBook = new Dictionary[10];
		phoneBook[0] = new Dictionary<>();
		phoneBook[0].setKey("Vivek");
		phoneBook[0].setValue(9607561857L);

		System.out.println(phoneBook[0].toString());

		Dictionary<String, String> wordDictionary = new Dictionary<>();
		wordDictionary.setKey("Fool");
		wordDictionary.setValue("Idiot");

		System.out.println(wordDictionary.toString());

	}
}
