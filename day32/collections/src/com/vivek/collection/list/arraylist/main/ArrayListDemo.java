package com.vivek.collection.list.arraylist.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
//		ArrayList arrayList=new ArrayList();
//		arrayList.add(1);
//		arrayList.add("ABC");
//		String data;
//		for(int i=0;i<arrayList.size();i++) {
//			data=(String) arrayList.get(i);
//		}

//		ArrayList<Integer> intArrayList = new ArrayList<>();
		List<Integer> intArrayList = new ArrayList<>();
//		Collection<Integer> intArrayList = new ArrayList<>();

		System.out.println("Default Size of arraylist" + intArrayList.size());
		intArrayList.add(1);
		intArrayList.add(5);
		intArrayList.add(4);
		intArrayList.add(8);
		intArrayList.add(7);
		intArrayList.add(16);

		intArrayList.set(4, 3);

		for (int i = 0; i < intArrayList.size(); i++)
			System.out.println(intArrayList.get(i));

		Integer element = 4;
//		intArrayList.remove(element);
//		System.out.println(intArrayList);

		Collections.sort(intArrayList);
		System.out.println(intArrayList);

		int elementIndex = intArrayList.indexOf(element);
		System.out.println(elementIndex);
	}
}
