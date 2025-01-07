package com.vivek.logicprograms.charactercounting.main;

import java.util.Scanner;

import com.vivek.logicprograms.charactercounting.CharacterCounting;

public class MainCharacterCounting {

	public static void main(String[] args) {
		CharacterCounting charCounting = new CharacterCounting();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String string = scanner.next();
		charCounting.setVariable(string);
		charCounting.countVowels();
	}

}