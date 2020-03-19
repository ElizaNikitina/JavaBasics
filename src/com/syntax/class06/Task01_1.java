package com.syntax.class06;

import java.util.Scanner;

   public class Task01_1{
	   
   
	   public static void main(String[] args) {
   
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter your country");
	String country = scan.nextLine();
	scan.close();
	String language;
	switch(country) {
	
	case "Russia":
		language = "russian";
		break;
	case "USA":
		language = "english";
		break;
	case "England":
		language = "english";
		break;
	case "Portugal":
		language = "portuguese";
		break;	
	case "Spain":
		language = "spanish";
		break;
	case "Germany":
		language = "deutsch";
		break;	
	case "France":
		language = "french";
		break;	
	case "Poland":
		language = "polish";
		break;	
	default:
		language = "unknown";
	}
	System.out.println("You are from " + country + " and you speak " + language );
   }
 }	   
