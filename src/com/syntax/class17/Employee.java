package com.syntax.class17;

public class Employee {

	// create variables to hold name, last name, title, ssn, salary

	public String name; //accessible everywhere
	protected String lastName; //accessible within same package
	public static String title;//accessible within same package
	private long ssn; //accessible only within same class
	 double salary;//accessible within same package

	public static void method1() {
		System.out.println("I am public method");
	}

	protected void method2() {
		System.out.println("I am protected method");
	}

	void method3() {
		System.out.println("I am default method");
	}
	
	private void method4() {
		System.out.println("I am a private method");
	}
	
	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.lastName = "Eliza";
		obj.lastName = "Nikitina";
		obj.salary = 900_000;
		obj.ssn = 444_555_663;
		//access methods
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}
}
