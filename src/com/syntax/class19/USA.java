package com.syntax.class19;

public class USA {
	
	String state;
	String stateCapital;
	
	USA(String state, String stateCapital){
		this.state = state;
		this.stateCapital = stateCapital;
	}
	
	public void displayState() {
		System.out.println(state);
	}
	public void displayCapital() {
		System.out.println(stateCapital);
	}
	
	public void displayMethod() {
		displayState();
		displayCapital();
	}
	
	public static void main(String[] args) {
		
		USA state1 = new USA("NY", "Albany");
		
		state1.displayState();
		state1.displayCapital();
		USA state2 = new USA("NY", "Albany");
		state2.displayMethod();
		state2 = new USA("Georgia", "Atlanta");
		state2.displayMethod();
		
	}
}
