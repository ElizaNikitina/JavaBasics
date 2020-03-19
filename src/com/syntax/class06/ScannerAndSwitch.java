package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your gender");
		
		 char gender;
		 String genderType;
		 gender = scan.next().charAt(0);
		  scan.close();
		  
		  switch(gender) {
		  case 'M':
			  genderType = "Male";
			  break;
		  case 'F':
			  genderType = "Female";
			  break;
		  default:
			genderType = "Unknown";	  
		  }
		  System.out.println("Your gender type is " + genderType);
	}

}
