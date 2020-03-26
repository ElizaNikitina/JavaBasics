package com.syntax.class17_1;

import com.syntax.class17.Employee;

public class AccessingMembersOfClass {
	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.name = "Eliza";
		//emp.lastName = "Nikitina";error
		//emp.salary = 100_000;error
		// emp.ssn = 444_555_555; error

		Employee.method1();
		//emp.method2();error
		//emp.method3();error
		// emp.method4(); error

	}
}
