package com.syntax.class03;

public class TemperatureCheck {
	public static void main(String []args) {
		
		double a = 30;
		
		if(a<32) {
			System.out.println("Water will freeze with "
					+ "temperature " + a);
		}
		else {
			System.out.println("Water will NOT freeze "
					+ "with temperature " + a);
		}
	}

}
