package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PersonHW {
	
	String name;
	String lastName;
	int age;
	double salary;
	
	PersonHW(String name, String lastName, int age, double salary){
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	
	public void showInfo() {
		System.out.println("Person name is "+ name + " " + lastName + " person age is " + age + " years old and person salary is: " + salary );
	}
}

