package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class StroringDifferentObjects {
	
	public static void main(String[] args) {
		
		HashSet<Insurance> hset = new HashSet<>();
		
		hset.add(new Car("Geico", "BMW"));
		hset.add(new Pet("Progressive", "Dog"));
		hset.add(new Health("BCBS"));
		System.out.println(hset.size());
		
		
		Iterator<Insurance> iter =  hset.iterator();
		
		while(iter.hasNext()) {
//			//System.out.println(iter.next());
//			iter.next().getQuote();
//			iter.next().cancelInsurance();
			
			//Insurance obj = new Car("Geico", "BMW")
			//we need to assing it to variable because i we use it.next()
			//--->moves to the next element
			
			Insurance obj = iter.next();
			obj.getQuote();
			obj.cancelInsurance();
			obj.method();
			
			System.out.println("-------------");
		}
	}

}
