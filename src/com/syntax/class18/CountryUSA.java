package com.syntax.class18;

public class CountryUSA {

	//create variables to hold state and capital of the state
	String state;
	String capitalofState;
	
	//create method to display state and stateCapital
	public  void showInfo() {
		System.out.println(capitalofState  + "  it is capital of " + state + " state");
	}
	
	//create the constructor that will initialize instance variables
	
	public CountryUSA(String state, String capitalofState){
		
		this.state = state;
		this.capitalofState = capitalofState;
	}
	
	public static void main(String[] args) {
		CountryUSA one = new CountryUSA("NY", "Albany");
		one.showInfo();
	}
	
}
