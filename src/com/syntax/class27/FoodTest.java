package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FoodTest {

	public static void main(String[] args) {
		Food[] foodArray = { new Meat("Meat"), new Vegie("Vegie"), new Bread("Bread"), new Pasta("Pasta") };

		ArrayList<Food> foods = new ArrayList();

		foods.add(new Meat("Meat"));
		foods.add(new Vegie("Vegie"));
		foods.add(new Bread("Bread"));
		foods.add(new Pasta("Pasta"));

		System.out.println("======eat=====");
		Iterator<Food> f = foods.iterator();
		while (f.hasNext()) {
			f.next().eat();
		}
		System.out.println("=====cook======");
		Iterator<Food> fcook = foods.iterator();
		while (fcook.hasNext()) {
			fcook.next().cook();
		}
		
		System.out.println("=====calories======");
		Iterator<Food> fcal = foods.iterator();
		while (fcal.hasNext()) {
			fcal.next().cook();
		}

		System.out.println("=====inhance for loop=====");
		for(Food x: foods) {
			x.eat();
			x.cook();
			x.calories();
		}
		
		System.out.println("=====regular for loop=====");
		for (int a = 0; a < foods.size(); a++) {
			foods.get(a).eat();
			foods.get(a).cook();
			foods.get(a).calories();
		}
		
		List<Food> food = new LinkedList<>();
		food.add(new Meat("meat"));
		food.add(new Bread("bread"));
		food.add(new Vegie("vegie"));
		food.add(new Pasta("pasta"));
		
		for(Food d:food) {
			d.calories();
			d.eat();
			d.cook();
		}
		
		
	}
}
