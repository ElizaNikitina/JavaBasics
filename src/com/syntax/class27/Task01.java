package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task01 {

	public static void main(String[] args) {

		ArrayList<String> car = new ArrayList<>();

		car.add("audi");
		car.add("lada");
		car.add("toyota");
		car.add("cadilac");

		for (String a : car) {
			System.out.print(a + "; ");
		}

		System.out.println();

		for (int a = 0; a < car.size(); a++) {
			System.out.print(car.get(a) + "; ");
		}
		
		System.out.println();

		Iterator<String> iter = car.iterator();
		while (iter.hasNext()) {
			String a = iter.next();
			System.out.print(a + "; ");
		}
	}

}
