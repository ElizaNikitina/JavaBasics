package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

abstract class Store {
	String name, type;

	public Store(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public void display() {
		System.out.println("This is " + name);
	}

	public abstract void workingHours();

}

class Nike extends Store {
	public Nike(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name + " working hour is from 10 am untill 6 pm");
	}
}

class Costco extends Store {
	public Costco(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name + " working hour is from 8 am untill 10 pm");
	}

}

class Amazon extends Store {
	public Amazon(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name + " working hour is 24/7");
	}
}

public class UserDefinedClassesInMap {
	public static void main(String[] args) {
		
		//we want to store in form 1-->amazon, 2-->cosco, 3-->nike
		
		Map<Integer, Store> storeMap = new LinkedHashMap<>();
		storeMap.put(1, new Amazon("online", "Amazon"));
		storeMap.put(2, new Costco("wholesale", "Costco"));
		storeMap.put(3, new Nike("retail", "Nike"));
		
		System.out.println(storeMap);
		System.out.println("--------------------------");
		//to get acces to all methods of our store objects we can use
		//.values(); .keySet(); .entrySet();
		
		//1st way get all value Objects
		Collection<Store> col = storeMap.values();
		for(Store store:col) {
			store.display();
			store.workingHours();
			System.out.println("--------------------------");
		}
		
		//2nd way get all entry objects --->getValue
		System.out.println("=====Second way=====");
		Set<Entry<Integer, Store>> storeSet = storeMap.entrySet();
		for(Entry<Integer, Store> entry :storeSet) {
			entry.getValue().workingHours();
			entry.getValue().display();
			System.out.println("--------------------------");
		}
	}
}
