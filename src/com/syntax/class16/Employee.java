package com.syntax.class16;

public class Employee {
//	    Create a Class called Employee:
//		Create three  variables  eID , salary and set the CEO to “Sumair” 
//		Create two objects of the class Employee 
//		Set the value of eID, salary for each of the objects
//		Print out the eID , salary and  CEO for each of the objects 
	
	int eID;
	double salary;
	String CEO = "Sumair";
	
	void displayInfo() {
		System.out.println("ID number of emplyee is: " + eID + ". Salary is:" + salary + " CEO " + CEO);
	}
	
	public static void main(String[]args) {
		Employee emp1 = new Employee();
		emp1.eID = 10001;
		emp1.salary = 1000;
		emp1.displayInfo();
		
		Employee emp2 = new Employee();
		emp2.eID = 10002;
		emp2.salary = 2000;
		emp2.displayInfo();
		
	}
	

}
