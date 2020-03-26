package com.syntax.class17;

public class StaticKeywordTest {
	public static void main(String[] args) {
		//access static members of anothe class
		StaticKeyWord.brand = "Android";
		StaticKeyWord.touchScreen = true;
		StaticKeyWord.displayGeneralInfo();
		
		//access instance members of another class
		
		StaticKeyWord obj = new StaticKeyWord();
		obj.color = "red";
		obj.memory = 128;
		obj.displaySpecification();
	}

}
