package com.syntax.class27;

import java.util.ArrayList;

public class Drinks {
	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();

		drinks.add("beer");
		drinks.add("cocktail");
		drinks.add("juce");
		drinks.add("coffe");
		drinks.add("milk");
		drinks.add("limonade");

		for (int a = 0; a < drinks.size(); a++) {

			if (drinks.get(a).contains("a") || drinks.get(a).contains("e")) {
				drinks.set(a, "water");
			}
		}
		System.out.println(drinks);
	}
}
