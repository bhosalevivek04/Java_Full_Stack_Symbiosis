package com.vivek.logicprograms.charactercounting;

public class CharacterCounting {
	String variable;

	public CharacterCounting() {
	}

	public CharacterCounting(String variable) {
		this.variable = variable;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public void countVowels() {
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		int consonant = 0;

		for (int j = 0; j < variable.length(); j++) {
			switch (variable.charAt(j)) {
			case 'a' | 'A':
				a++;
				break;
			case 'e' | 'E':
				e++;
				break;

			case 'i' | 'I':
				i++;
				break;

			case 'o' | 'O':
				o++;
				break;

			case 'u' | 'U':
				u++;
				break;
			default:
				consonant++;

			}
		}
		System.out.println("a: " + a);
		System.out.println("e: " + e);
		System.out.println("i: " + i);
		System.out.println("o: " + o);
		System.out.println("u: " + u);
		System.out.println("consonant: " + consonant);
	}

}
