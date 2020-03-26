package com.syntax.class17;

public class AccessingMembersOfClass {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.name = "Eliza";
		emp.lastName = "Nikitina";
		emp.salary = 100_000;
		//emp.ssn = 444_555_555; error
		
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.method4(); error
		

	}
}
