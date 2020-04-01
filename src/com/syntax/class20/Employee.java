package com.syntax.class20;

public class Employee {
	
	public static String company;
	protected int empNumber;
	double salary;
	private long ssn;
	
	void getPaid() {
		System.out.println("Emploeer pays " + salary);
	}
	
	static void work() {
		System.out.println("Emploee works in " + company);
	}
}
