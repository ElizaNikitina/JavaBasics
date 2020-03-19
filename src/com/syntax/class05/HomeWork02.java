package com.syntax.class05;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Please enter your birth month");
		 String month = scan.nextLine();
		 scan.close();
		 String season = null;
		 
		 if(month.equalsIgnoreCase("December")||month.equalsIgnoreCase("Januray") || month.equalsIgnoreCase("February")) {
			 season = "Winter";
		 }else if(month.equalsIgnoreCase("March")||month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			 season = "Spring";
		 }else if(month.equalsIgnoreCase("June")||month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			 season = "Summer";
		 }else if(month.equalsIgnoreCase("September")||month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			 season = "Fall";
		 }else {
			 season = "Unkown";
		 }
		 
		 if(!season.equals("Unkown")){
		 System.out.println("Your were born in " + season);
		 }else if(season.equals("Unkown")) {
			 System.out.println("Are you sure?");
		 }
	}

}
