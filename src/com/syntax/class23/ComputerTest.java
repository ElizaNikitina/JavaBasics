package com.syntax.class23;

public class ComputerTest {
	public static void main(String[] args) {
		Computer[] comps = { new Apple("Apple", "368 GB"), new HP("HP", "128 GB"), new Lenovo("Lenovo", "64GB"),
				new Dell("Dell", "128 GB") };

		for (Computer c : comps) {
			c.use();
			c.showInfo();
			System.out.println("=======");
		}
		
		
		

	}
}