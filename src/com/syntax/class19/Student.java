package com.syntax.class19;

public class Student {
	
	String name, address;
	
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	void showInfo() {
		System.out.println("Student name is " + this.name +" and address is " +this.address);
	}
 public static void main(String[] args) {
	Student st1 = new Student("Eliza", "1366 New York av.");
	st1.showInfo();
}
}
