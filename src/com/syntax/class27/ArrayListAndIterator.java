package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator {
	public static void main(String[] args) {
		
		//create array list of choco
		
		ArrayList<String> choco = new ArrayList<>();
		
		choco.add("kinder");
		choco.add("godiva");
		choco.add("kit kat");
		choco.add("snikers");
		
		//create array list of sweets

		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		sweets.addAll(choco);
		
		System.out.println(sweets.size());
		System.out.println(sweets);
		
		//we want to iterate through the collection
		
		Iterator<String> iter  = sweets.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			if(element.equals("ice cream")) {
				iter.remove();
			}
		}
		System.out.println("Array aftre removing element");
		System.out.println(sweets);
		
		for(int a=sweets.size()-1; a>=0; a--) {
			
			System.out.print(sweets.get(a) + "; ");	
		}
		System.out.println();
		
		for(String s: sweets) {
			System.out.print(s + "; ");
		}
		
	}
}
