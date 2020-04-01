package com.syntax.class20;

public class ScrumTeamTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.empNumber = 100001;
		emp.salary = 20_000;
		emp.getPaid();
		
		ScrumTeam obj1 = new ScrumTeam();
		obj1.getPaid();
		obj1.attendMeetings();
		
		ProductOwner po = new ProductOwner();
		po.attendMeetings();
		po.prioritizeBacklog();
		po.company = "Syntax";
		ProductOwner.work();
		Employee.work();
		
		
		
		ScrumMaster obj3 = new ScrumMaster();
		
		Developer obj4 = new Developer();
		
		Tester obj5 = new Tester();
		
		BuisnessAnalyst obj6 = new BuisnessAnalyst();
		
		
		
		
		
	}

}
