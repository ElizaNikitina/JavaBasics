package com.syntax.class14;

public class Phone {

	String produser;
	String model;
	int yearOfrelease;
	int screanSize;

	void pics() {
		System.out.println("phone can take a pick");
	}

	void call() {
		System.out.println("phone can call");
	}

	public static void main(String[] args) {
		Phone ph1 = new Phone();
		ph1.produser = "Nokia";
		ph1.model = "3310";
		ph1.yearOfrelease = 2000;
		ph1.screanSize = 1;
		ph1.pics();
		ph1.call();

		Phone ph2 = new Phone();
		ph2.produser = "Apple";
		ph2.model = "IphoneMax";
		ph2.yearOfrelease = 2019;
		ph2.screanSize = 6;
		ph2.pics();
		ph2.call();

		Phone ph3 = new Phone();
		ph3.produser = "Android";
		ph3.model = "Mi1";
		ph3.yearOfrelease = 2015;
		ph3.pics();
		ph3.call();

		String str = "Hello friend";
		str=str.replace("Hello", "Welcpme");
		

	}

}
