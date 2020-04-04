package com.syntax.class22;

public class CreditCardTest {
	public static void main(String[] args) {
		CreditCard cc = new CreditCard();
		cc.balance = 500;
		System.out.println(cc.getInterset());
		
		AX ax= new AX();
		ax.balance=500;
		System.out.println(ax.getInterset());
		
		Visa visa = new Visa();
		visa.balance=500;
		System.out.println(visa.getInterset());
		
	}

}
