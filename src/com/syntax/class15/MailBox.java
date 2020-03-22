package com.syntax.class15;

public class MailBox {
	// Create a method createEmail().
	// Based on provided users name, lastName and email type,
	// your method should return complete email Address.
	// Example: johnsnow@gmail.com or johnsnow@yahoo.com*

	String mailcreate(String name, String lastName, String emailType) {
		String b = null;
		if (emailType.equals("gmail")) {
			b = name + lastName + "@" + emailType+ ".com";
		} else if (emailType.equals("yahoo")) {
			b = name + lastName + "@" + emailType+ ".com";
		} else if (emailType.equals("mail")) {
			b = name + lastName + "@" + emailType+ ".com";	
		}
		return b;
	}
	
	public static void main(String[]args) {
		MailBox mail = new MailBox();
		String a = mail.mailcreate("Eliza", "Nikitina", "gmail");
		System.out.println(a);
		a= mail.mailcreate("Artem", "Nikitin", "yahoo");
		System.out.println(a);
	}
}
