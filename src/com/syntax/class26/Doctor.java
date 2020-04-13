package com.syntax.class26;

public class Doctor {
	
	private long licenceId;
	private long phineNumber;
	private String email;
	
	public void setEmail(String email) {
		if(!email.isEmpty()) {
			if(email.contains("gmail")) {
				this.email = email;
			}else {
				System.out.println("Email must be of gmail type");
			}	
		}else {
			System.out.println("Email cannot be empty");
		}
	}
	
	public String getEmail() {
		return email;
	}
	

}
