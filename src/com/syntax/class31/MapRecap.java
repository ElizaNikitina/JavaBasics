package com.syntax.class31;

import java.util.*;
import java.util.Map.Entry;

public class MapRecap {
	public static void main(String[] args) {
		
		//create countries and capitals in HashMap
		
		Map<String, String> hmap = new HashMap<>();
		hmap.put("USA", "Washington DC");
		hmap.put("Russia", "Moscow");
		hmap.put("France", "Paris");
		hmap.put("Tajikistan", "Dushanbe");
		hmap.put("Italy", null);
		hmap.put(null, "some value");
		hmap.put(null, "another value"); //duplicate key previouse value will be overwriting
		
		System.out.println(hmap);
		
		//how to get all keys from a map keySet(), entrySet();
		
		Set <String> keys = hmap.keySet(); //use loop or iterator
		Iterator <String> iter = keys.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		Set<Entry<String, String>> entries = hmap.entrySet();
		Iterator<Entry<String, String>> iter1 = entries.iterator();
		while(iter1.hasNext()) {
			//System.out.println(iter1.next());
			Entry<String, String> entry = iter1.next();
			String myEntry = entry.getKey() + "==>" + entry.getValue();
			System.out.println(myEntry);
		String key=	iter1.next().getKey();
		System.out.println(key);
		}
		
		//how to get only value from a map? values(); entrySet();
		System.out.println("=====values using values() method========");
		Collection<String> values = hmap.values();
		iter = values.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//hashTable
		System.out.println();
		Map<String, String> htable =new Hashtable<>();
		htable.put("USA", "Washington DC");
		htable.put("Russia", "Moscow");
		htable.put("France", "Paris");
		htable.put("Tajikistan", "Dushanbe");
		//htable.put("Italy", null); we cannot store null values inside hashtable
		//htable.put(null, "some value");  we cannot store null keys inside hashtable
		System.out.println(htable);
		
		
		//first part of code
		createMap("City", "Chantilly");
		
	}
	
	public static Map<String, String> createMap(String key, String value) {
		Map map = new HashMap<>();
		map.put(key, value);
		
		return map;
	}
}
