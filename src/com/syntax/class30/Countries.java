package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Countries {
	public static void main(String[] args) {
		Map<String, String> country = new TreeMap<>();
		country.put("USA", "Washington");
		country.put("Russia", "Moscow");
		country.put("Poland", "Warshaw");
		country.put("Italy", "Rom");
		country.put("France", "Parish");
		country.put("Spain", "Madrid");

		
		
		Set<Entry<String, String>> land= country.entrySet();
		System.out.println(land);
		
		//loop through all entries to get key and value
		for(Entry<String, String> entr :land) {
			System.out.println(entr.getKey());
			System.out.println(entr.getValue());	
		}
		
		//iterate through all entries to get key and value
		
		Iterator<Entry<String, String>> entryIterator = land.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, String> e = entryIterator.next();
		String keyValue = e.getKey() +":::" +  e.getValue();
		System.out.println(keyValue);
		}
		
		
		System.out.println("====for loop=====");
		for (String coun : country.keySet()) {
			System.out.println("Country name is " + coun + " and capital is " + country.get(coun));
		}
		System.out.println("====");
		Iterator<String> countIt = country.keySet().iterator();
		while (countIt.hasNext()) {
			System.out.println("Country name is " + countIt.next());
		}

	}
}
