package com.syntax.class20_1;

import com.syntax.class20.Employee;

public class WaterFallTeam extends Employee  {
	
	public static void main(String[] args) {
		
		WaterFallTeam wteam = new WaterFallTeam();
		WaterFallTeam.company = "Syntax";
		wteam.empNumber = 20001; //protected variables is visible to the child in different packeges
		// wteam.salary = 20_000;  default is not visible
		// wteam.ssn private is not visible
	}
	

}
