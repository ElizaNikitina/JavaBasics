package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Task01 {
	public static void main(String[] args) {
		
		Map<Integer, String> buy = new LinkedHashMap<>();
		buy.put(456578, "Printer");
		buy.put(456580, "TV");
		buy.put(456582, "Laptop");
		buy.put(456583, "Phone");
		buy.put(456584, "mouse");
		buy.put(456585, "adapter");
		buy.put(456586, "goPro");
		
		System.out.println(buy);
		
		 System.out.println("=========");
		 
		
		   Set<Entry<Integer, String>> entr=buy.entrySet();
		  
		   for(Entry<Integer, String> e: entr) {
			   System.out.println("Item ID: " +e.getKey()+  " Item name: " + e.getValue());
		   }
		   
		   System.out.println("=========");
		   
		   Iterator<Entry<Integer, String>> iter = entr.iterator();
		   while(iter.hasNext()) {
			   Entry<Integer, String> entry = iter.next();
			   System.out.println("Item ID: " +entry.getKey() + " Item name: " + entry.getValue());
		   }
		   
	}

}
