package com.syntax.class29;

import java.util.*;

public class Task01 {

	/*
	 * Create a Set collection in which you need to add names of the countries. In
	 * this set we want all objects to be sorted in alphabetical order. Using 2
	 * different ways retrieve all elements from set.
	 */
	public static void main(String[] args) {

		Set<String> coun = new TreeSet<>();
		coun.add("USA");
		coun.add("Russia");
		coun.add("Germany");
		coun.add("France");
		coun.add("Poland");

		System.out.println(coun);
		
		Iterator<String> it = coun.iterator();
		while(it.hasNext()) {
		System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("===");
		for(String a:coun) {
			System.out.print(a+" ");
		}
	}

}
