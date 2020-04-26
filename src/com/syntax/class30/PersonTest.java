package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PersonTest {

		public static void main(String[] args) {
			
			Map<Integer, PersonHW> pers = new TreeMap<>();
			
			pers.put(123, new PersonHW("Eliza", "Nikitina", 37, 1_2345_668.0));
			pers.put(124, new PersonHW("Artem", "Nikitin", 43, 2_000_025.0));
			pers.put(125, new PersonHW("Anton", "Ivanov", 24, 545_668.0));
			
			Collection<PersonHW> per = pers.values();
			for(PersonHW p:per) {
				p.showInfo();
			}
			System.out.println();
			Iterator<PersonHW> it = per.iterator();
			while(it.hasNext()) {
				PersonHW info = it.next();
				info.showInfo();
			}
		}
	}


