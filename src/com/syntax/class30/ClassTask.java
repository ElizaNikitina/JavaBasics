package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ClassTask {
	
		public static void main(String[] args) {
			Map<String, String> country=new TreeMap<>();
			country.put("Afghanistan","Kabul");
			country.put("Canada", "Ottawa");
			country.put("Bangladesh","Dhaka");
			country.put("India", "New Delhi");
			country.put("China","Beijing" );
			country.put("Egypt", "Cairo");
			country.put("Hungary", "Budapest");
			country.put("Kazakhstan","Nur-Sultan");
			country.put("Turkey","Ankara");
			country.put("USA","Washington D.C.");
			System.out.println("TreeSet is: "+country);
			System.out.println("==Using for each loop==============");
			for(String s:country.keySet()) {
				System.out.println("Country Name is "+s+" and it's capital city is "+country.get(s));
			}
			System.out.println("==Using Iterator==============");
			Iterator<String> it=country.keySet().iterator();
			while(it.hasNext()) {
				String s=it.next();
				System.out.println("Country Name is "+s+"  and capital city is "+country.get(s));
			}
			System.out.println("==Printing values Using Iterator==============");
			Iterator<String> it1=country.values().iterator();
			while(it1.hasNext()) {
				String s=it1.next();
				System.out.println("Capital city Name is "+s);
			}
				System.out.println("==Printing Keys Using Iterator==============");
				Iterator<String> it2=country.keySet().iterator();
				while(it2.hasNext()) {
					String s=it2.next();
					System.out.println("Country Name is "+s);
			}
		}
	}

