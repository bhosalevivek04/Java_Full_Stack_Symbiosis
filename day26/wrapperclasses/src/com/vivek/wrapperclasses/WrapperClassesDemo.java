package com.vivek.wrapperclasses;

public class WrapperClassesDemo {

	public static void main(String[] args) {
//		Integer var1 = new Integer(10);  //depricate from SE version 9
//		Integer var1 = 10;
//		System.out.println(var1);

		// Boxing
		Integer var2 = Integer.valueOf(20);
		System.out.println(var2);
		// UnBoxing
		int var3 = var2.intValue();
		System.out.println(var3);

		Float var4 = Float.valueOf(12.5f);

		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648

		int parseResult = Integer.parseInt("123");
		System.out.println(parseResult);

		Float parseFloatResult = Float.parseFloat("123.67");
		System.out.println(parseFloatResult);

		int intValueResult = var2.intValue();
		System.out.println(intValueResult);
		float floatValueResult = var4.floatValue();
		System.out.println(floatValueResult);
		
		Byte byteVar=10;
		System.out.println(Integer.toBinaryString(byteVar));
		
		//isAlphabet isDigit
		Character ch='A';
		
		boolean isAlphabet=Character.isAlphabetic(ch);
		System.out.println(isAlphabet);
		
		boolean isDigit=Character.isDigit(ch);
		System.out.println(isDigit);
		
		
	}

}
