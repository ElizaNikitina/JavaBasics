package com.syntax.class16;

public class Students {
	
//	Create a Class called Students
//	Create three  variables  studentName , studentID  and  numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students
	String studentName;
	int studentId;
	static int numberOfStudents;
	
	public static void main(String[]args) {
		Students st1 = new Students();
		st1.studentName = "Eliza Nikitina";
		st1.studentId  = 10001;
		st1.numberOfStudents ++;
		
		Students st2 = new Students();
		st2.studentName = "Malivannikova Margarita";
		st2.studentId = 10002;
		st2.numberOfStudents++;
		
		Students st3 = new Students();
		st3.studentName = "Valera Tsybulko";
		st3.studentId = 10003;
		st3.numberOfStudents++;
		
		
		System.out.println(numberOfStudents);
		
		
		
	}

}
