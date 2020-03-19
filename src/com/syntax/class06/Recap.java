package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		int hour = 25;
		String timeDay;
		
		if(hour>1 && hour <12) {
			timeDay = "Morning";		
		}else if(hour>=12 && hour < 15) {
			timeDay = "Afternoon";
		}else if(hour>=15 && hour < 20) {
			timeDay = "Evening";
		}else if(hour>=20 && hour <= 24) {
			timeDay = "Night";
		}else {
			timeDay = "Unknown";
		}
		
		if(!timeDay.equals("Unknown")) {
			System.out.println("Right now is " + timeDay);
		}


	
	}
}
