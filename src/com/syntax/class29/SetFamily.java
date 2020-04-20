package com.syntax.class29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.*;
public class SetFamily {

	public static void main(String[] args) {
		//hashSet does not guaranriee insert order
		Set<String> veggies=new HashSet<>(); //TreeSet alfabet order
		
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("cucumber");
		
		
		System.out.println(veggies);

		//LinkedHashSet guaranriee insertion order
		Set<String> fruits=new LinkedHashSet<>();
		
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("tomato");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("tomato");
		System.out.println(fruits);
		
		//tree set store objects in ascending oredr
		Set<String> food = new TreeSet<>(veggies);
		food.addAll(fruits);
		System.out.println(food);
		
	}
}
