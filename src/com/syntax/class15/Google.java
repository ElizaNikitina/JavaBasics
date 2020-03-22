package com.syntax.class15;

public class Google {
	// define feature such emp id, name, last name, salary
	// define a behavior working, get paid, attending meetings

	int id;
	String name;
	String lastName;
	String title;
	double salary;

	void working() {
		System.out.println(title + " is working");
	}

	void getPaid() {
		System.out.println(name + " " + lastName + " is getting paid  "+ salary + "$");
	}

	void attendingMeetings() {
		System.out.println(name + " attending meetings");
	}

	public static void main(String[]args) {
		Google emp1= new Google();
		emp1.id = 123;
		emp1.name = "John";
		emp1.lastName = "Smith";
		emp1.title = "CEO";
		emp1.salary = 2_000_000;
		
		emp1.getPaid();
		emp1.working();
		emp1.attendingMeetings();
		
		Google emp2 = new Google();
		emp2.id = 124;
		emp2.name = "Eliza";
		emp2.lastName = "Nikitina";
		emp2.title = "QA Engeneer";
		emp2.salary = 1_000_000;
		
		emp2.getPaid();
		emp2.working();
		emp2.attendingMeetings();
		
	}
}
