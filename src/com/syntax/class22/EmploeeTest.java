package com.syntax.class22;

public class EmploeeTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.salary = 80_000;
		emp.getPaid();
		
		FullTimeEmployee ft = new FullTimeEmployee();
		ft.salary = 90_000;
		ft.getClass();
		
		PartTimeEmployee pt = new PartTimeEmployee();
		pt.salary= 60_000;
		pt.getPaid();
		
		
		Contractor ct = new Contractor();
		ct.hourlyRate = 50;
		ct.getPaid();
	}

}
