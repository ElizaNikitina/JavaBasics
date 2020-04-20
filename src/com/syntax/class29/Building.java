package com.syntax.class29;

import java.util.*;

public class Building {
	public static void main(String[] args) {

		Map<Integer, String> build = new HashMap<>();
		build.put(1, "Google");
		build.put(2, "Syntax");
		build.put(3, "Oracle");
		build.put(4, "Microsoft");
		build.put(5, "Apple");
		build.put(6, "Sap");
		build.put(7, "Unknown");

		int size = build.size();
		System.out.println("Map size is " + size);

		// how to get all keys

		Set<Integer> keys = build.keySet();
		System.out.println(build.keySet());

		System.out.println("=====getting keys using iterator=====");
		Iterator<Integer> keysIt = keys.iterator();
		while (keysIt.hasNext()) {
			int a = keysIt.next();
			System.out.println("Key is " + a + " and its value is " + build.get(a));
		}

		build.replace(4, "Lenovo");
		System.out.println(build);

		build.remove(7);
		System.out.println(build);
		
		System.out.println("=====getting keys using for each loop=====");
		for(int k:keys) {
			System.out.println("Key from building map " + k + ": "+ build.get(k));
		}
		
		
		//how to get all values
		Collection<String> values = build.values();
		System.out.println("=====getting all values using for each loop=====");
		for(String v:values) {
			System.out.println("Value from collection "+v);
		}
		System.out.println("=====getting all values using iterator=====");
		
		Iterator<String> valuesIt = values.iterator();
		while(valuesIt.hasNext()) {
			System.out.println("Map value: "+ valuesIt.next());
		}
	}

}
