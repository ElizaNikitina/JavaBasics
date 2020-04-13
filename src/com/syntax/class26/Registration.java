package com.syntax.class26;

class Registration {
	private String email;
	private String userName;
	private String password;

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setEmail(String email) {
		if (email.contains("@yahoo")) {
			this.email = email;
		} else {
			this.email = "invalid email";
			System.out.println("Please use @yahoo only");
		}
	}

	public void setUsername(String userName) {
		if (!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
		} else {
			this.userName = "invalid user name";
			System.out.println("User name cannot be empty and lenght should be more than 6 charcters");
		}

	}

	public void setPasswordl(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (!password.equalsIgnoreCase(userName)) {
					this.password = password;
				} else {
					this.password = "invalid password";
					System.out.println("password cannot contain user name");
				}
			} else {
				this.password = "invalid password";
				System.out.println("password is too short");
			}
		} else {
			this.password = "invalid password";
			System.out.println("password cannot be empty");
		}
	}
}
