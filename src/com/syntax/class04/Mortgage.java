package com.syntax.class04;

public class Mortgage {

	public static void main(String[] args) {
		double mortgageRate = 4.3;
		long price = 450_000;
		
		if(mortgageRate<4.5) {
			System.out.println("I will think about byying a hose");
			if(price>=200_000) {
				System.out.println("I will take a loan");
			}else {
				System.out.println("I will pay with cash");
			}
		}else {
			System.out.println("I will not buy a hose");
		}

	}

}
