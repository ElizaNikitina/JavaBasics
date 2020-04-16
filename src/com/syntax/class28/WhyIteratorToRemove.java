package com.syntax.class28;

import java.util.ArrayList;

public class WhyIteratorToRemove {
	
	public static void main(String[] args) {
		
		ArrayList<String> drinks = new ArrayList<>();

		drinks.add("beer");
		drinks.add("cocktail");
		drinks.add("juce");
		drinks.add("coffe");
		drinks.add("milk");
		drinks.add("milk");
		drinks.add("tea");
		drinks.add("tea");
		drinks.add("limonade");
		System.out.println(drinks);

		for(int i=0; i<drinks.size(); i++) {
			if(drinks.get(i).equals("milk")|| drinks.get(i).equals("tea")){
				drinks.remove(i);
			}
		}
		System.out.println(drinks);
	}

}
