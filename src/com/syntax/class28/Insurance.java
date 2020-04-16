package com.syntax.class28;

public abstract class Insurance {
	
	public String insuranceName;
	
	public Insurance(String insuranceName){
		this.insuranceName = insuranceName;
	}
	
	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Car extends Insurance{
	int price;
	public Car(String insuranceName, int price) {
		super(insuranceName);
		this.price = price;
	}

	@Override
	public void getQuote() {
		if(price<1000) {
			System.out.println("Your insurance price is " + (price*0.2));
		}else {
			System.out.println("Your insurance price is " + (price*0.5));
		}
		
	}

	@Override
	public void cancelInsurance() {
			
	}
}
