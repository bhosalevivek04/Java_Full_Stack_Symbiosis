package com.vivek.generics.classes;

public class GenericClassForArrays<T> {
	private T[] tArray;

	public T[] gettArray() {
		return tArray;
	}

	public void settArray(T[] tArray) {
		this.tArray = tArray;
	}
	
	public void printArray() {
		for(T element:tArray) {
			System.out.println(element);
		}
	}
	
}
