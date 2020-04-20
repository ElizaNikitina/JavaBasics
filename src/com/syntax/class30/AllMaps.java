package com.syntax.class30;

import java.util.*;

public class AllMaps {
	public static void main(String[] args) {
        //create grocery map, don`t care about order
		//
		
		Map<String,Integer> grocery = new HashMap<>();
		grocery.put("milk", 1);
		grocery.put("cucumber", 3);
		grocery.put("banana", 12);
		grocery.put("cheese", 2);
		grocery.put("grapes", 3);

		System.out.println(grocery);
		
		//create a map of items to buy(items, quantiry)
		Map<String, Integer> household =new LinkedHashMap<>();
		household.put("lysol", 2);
		household.put("sanitaizer", 2);
		household.put("paper towel", 3);
		household.put("toilet paper", 10);
		household.put("face mask", 50);
		System.out.println(household);
		
		//create one shoping list from previous items in ascending order
		Map<String, Integer> shopping = new TreeMap<>();
		shopping.putAll(grocery);
		shopping.putAll(household);
		System.out.println(shopping);
		
		
		//get all keyss
		for(String key:shopping.keySet()) {
			System.out.println("Key: "+key);
		}
		
		//get all keys using iterator
		Iterator<String> iter=shopping.keySet().iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		System.out.println();
		//get all values
		for(int val:shopping.values()) {
			System.out.println("Value " + val);
		}
		
		Iterator<Integer> iterator= shopping.values().iterator();
		while(iterator.hasNext()) {
			System.out.println("value = " + iterator.next());
		}
	}
}
