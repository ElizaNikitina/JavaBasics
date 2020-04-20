package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task03 {

	public static void main(String[] args) {
		Set<Students> students = new HashSet<>();
		students.add(new Students("Nikitina", 123));
		students.add(new Students("Kulik", 1234));

		Iterator<Students> it = students.iterator();
		while(it.hasNext()) {
			Students obj = it.next();
			obj.showInfo();
		}
	}
}

class Students{
	String name;
	int ID;
	Students(String name, int ID){
		this.name= name;
		this.ID = ID;
		
	}
	
	void showInfo() {
		System.out.println("Students name " + name + " ID " + ID ) ;
	}
}