package com.syntax.class29;

import java.util.*;
import java.util.TreeSet;

public class Task02 {
	public static void main(String[] args) {
		Set<String> city = new LinkedHashSet<>();
		
		city.add("NY");
		city.add("LA");
		city.add("Miami");
		city.add("Albany");
		city.add("Chicago");
		
		System.out.println(city);
		
		Iterator<String> it = city.iterator();
		while(it.hasNext()) {
			if(it.next().startsWith("A")) {
				it.remove();
			}
		}
	System.out.println(city);
	}
}
