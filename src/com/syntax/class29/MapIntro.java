package com.syntax.class29;

import java.util.HashMap;

public class MapIntro {
	public static void main(String[] args) {

		// HashMap is not maintain order
		HashMap<String, String> hmap = new HashMap<>();

        //to store values into Map we use put
		hmap.put("Name", "Jone");
		hmap.put("Last name", "Smith");
		hmap.put("Address", "123 Test");
		hmap.put("City", "Chantilly");

		// how to check if map has any value?
		boolean isEmpty = hmap.isEmpty();
		System.out.println("Map is empty = " + isEmpty);

		// how many elements is Map has
		int size = hmap.size();
		System.out.println("Map size is " + size);

		// can we add more values?
		hmap.put("Zip", "12345");

		// can we store duplicate keys?

		hmap.put("Name", "Jane");
		System.out.println(hmap);
		
		//how to access the value?
		//use method get and specify the key
		System.out.println(hmap.get("Name"));
		
		//how to remove value
		hmap.remove("Address");
		System.out.println(hmap);
		
		//how to replace value
		hmap.replace("Zip", "98765");
		System.out.println(hmap);

	}
}
