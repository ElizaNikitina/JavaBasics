package com.syntax.class20;

public class Employee {
	static String company;
	int empNumber;
	double salary;
	
	void getPaid() {
		System.out.println("Emploeer pays " + salary);
	}
	
	static void work() {
		System.out.println("Emploee works in " + company);
	}
}
