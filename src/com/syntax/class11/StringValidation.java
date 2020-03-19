package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		String str1 = "Welcome Syntax students";
		String str2 = "Welcome Syntax Students ";

		// method equals or equalsIgnoreCase()
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));

		String expected = "Welcome Syntax students";
		String actual = "   Welcome Syntax students";
		if (expected.equals(actual)) {
			System.out.println("Test case pass. Titles are matched");
		} else {
			System.out.println("Test case fails. Titles are not matched");
		}
		// first trin and then compare

		if (actual.trim().equals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		} else {
			System.out.println("Test case fails. Titles are not matched");
		}
		
		String browser="CHRome";
		if(browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on chrome browser");
		}
		
		

	}
}
