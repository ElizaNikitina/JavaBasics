package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task02 {

	public static void main(String[] args) {

		ArrayList<String> word = new ArrayList<>();

		word.add("book");
		word.add("lake");
		word.add("baker");
		word.add("brake");
		System.out.print(word);
		Iterator<String> iter = word.iterator();
		while (iter.hasNext()) {
			if(iter.next().endsWith("e")){
				iter.remove();
			}
			
		}
		System.out.println();
		System.out.print(word);
	}
}
