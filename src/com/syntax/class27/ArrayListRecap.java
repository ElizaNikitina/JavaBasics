package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {
	public static void main(String[] args) {

		// create array list taht stores double type of objects
		//generic colection / arrayList

		ArrayList<Double> aList = new ArrayList<>();
		aList.add(10.99);
		aList.add(12.90);
		aList.add(100.99);
		
		System.out.println(aList);
		
		//replace element
		aList.set(1,13.90);
		System.out.println(aList);

		
		aList.remove(1);
		System.out.println(aList);
		System.out.println("======");
		//retrieve all elements from collection
		//1.use advanced/enhanced for loop
		for(double s:aList) {
			System.out.println(s);
		}
		
		System.out.println("======");
		//2. for loop
		for(int a = 0; a<aList.size(); a++) {
			double d = aList.get(a);
			System.out.println(d);
		}
		
		System.out.println("======");
		//3.iterator
		
		Iterator<Double> iter  = aList.iterator();
		while(iter.hasNext()) {
			double d=iter.next();
			System.out.println(d);
		}
		
		
		System.out.println("   NON Generic collection   ");
		//non generic collection
		
		ArrayList obj = new ArrayList();
		obj.add("hello"); //store single object
		obj.add(100);
		obj.add('c');
		obj.addAll(aList); //store collection object
		
		System.out.println(obj);
		
		//retrieve all elements from collection
		
		for( Object a:obj) {
			System.out.println(a);
		}
		
//		for(int a= 0; a<obj.size(); a++) {
//			double d = aList.get(a);
//			System.out.println(d);
//		}
	}
}