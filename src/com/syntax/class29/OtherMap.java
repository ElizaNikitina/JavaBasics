package com.syntax.class29;

import java.util.*;

public class OtherMap {

	public static void main(String[] args) {

		Map<Integer, String> lmap = new LinkedHashMap<>();
		lmap.put(1000, "John Smith");
		lmap.put(1001, "Jane Smith");
		lmap.put(1002, "Eliza Nikitina");
		lmap.put(1003, "Artem Nikitin");

		System.out.println(lmap);

		// store objects in form of K and value and sort your key in ascending order
		//sorting our keys

		Map<Integer, String> tmap = new TreeMap<>();
		tmap.put(1000, "John Smith");
		tmap.put(1001, "Jane Smith");
		tmap.put(1002, "Eliza Nikitina");
		tmap.put(1003, "Artem Nikitin");

		System.out.println(tmap);
		
		//create of map of country and population
		Map<String, Integer> smap = new TreeMap<>();
		smap.put("USA", 200_000);
		smap.put("Russia", 150_000);
		smap.put("Poland", 10_000);
		smap.put("India", 1_000_000_000);
		System.out.println(smap);
		
		//how to get all key from Map
		
		Set<String> keys =  smap.keySet();
		for(String key:keys) {
		System.out.println("Key is " + key + " and value is " + smap.get(key));
		}
		
		System.out.println("======");
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key is " + key + " and value is " + smap.get(key)+ ". ");
		}
		
		System.out.println("======");
		
		//how to get all values fron map
		
		Collection<Integer> values =smap.values();
		for(int value: values) {
			System.out.println("Value is: "+value);
		}
		
		System.out.println("======");
		
		Iterator <Integer> iter =values.iterator();
		while(iter.hasNext()) {
			int value = iter.next();
			System.out.println("Value is: "+value);
		}
	}

}
