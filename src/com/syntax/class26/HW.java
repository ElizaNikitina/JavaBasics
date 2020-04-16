package com.syntax.class26;

import java.util.ArrayList;

public class HW {

	public static void main(String[] args) {
		// create an arraylist with 5 names

		ArrayList<String> arrayList = new ArrayList<>();
		// adding String Object into arrayList
		arrayList.add("Eliza");
		arrayList.add("Anton");
		arrayList.add("Andrey");
		arrayList.add("Artem");
		arrayList.add("Anna");

		System.out.println(arrayList); // all elements in array

		System.out.println("=========");

		System.out.println(arrayList.size()); // siza of array

		System.out.println("=========");

		// printing each element one by one
		for (int i = 0; i < arrayList.size(); i++) {
			String element = arrayList.get(i);
			System.out.println(element);
		}
		System.out.println("=========");

		// printing specific number
		String fourthElement = arrayList.get(3);
		System.out.println(fourthElement);
		System.out.println("=========");

		if (arrayList.isEmpty()) {
			System.out.println("is empty");
		} else {
			System.out.println("is not empty");
		}
		if (arrayList.contains("Eliza")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}
}
