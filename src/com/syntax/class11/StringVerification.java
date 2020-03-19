package com.syntax.class11;

public class StringVerification {
	public static void main(String[] args) {
		
		String message = "Welcome Admine";
		
		//verify that massage contains username which is Admine
		
		System.out.println(message.contains("Admine"));
		boolean flag =message.contains("Welcome");
		System.out.println(flag);
		
		//we want to see  if welcome starts with Welcome
		boolean starts=message.startsWith("Welcome");
		System.out.println(starts);
		
		String username="Admine";
		boolean ends=message.endsWith(username);
		System.out.println(ends);
	}
}
