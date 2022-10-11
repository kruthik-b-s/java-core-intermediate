package com.training.phase2;

public class UserExample {
	private int password;
	private String email;
	private String name;

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		
		if (this.password == 0) {
			if (password > 999) {
				this.password = password;
				System.out.println("Password set successfully");
			} else {
				System.out.println("Password not in range");
				System.out.println("Enter password again:");
				setPassword(UserExampleMain.sc.nextInt());
			}
		} else {
			System.out.println("Enter previous password:");
			if (UserExampleMain.sc.nextInt() == this.password) {
				System.out.println("Enter new password:");
				this.password = UserExampleMain.sc.nextInt();
				System.out.println("Password set successfully");
			} else {
				System.out.println("Password mismatch");
				setPassword(password);
			}
		}

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (!email.equals(null) && email.endsWith("@gmail.com")) {
			this.email = email;
		} else {
			System.out.println("Invalid email");
			setEmail(UserExampleMain.sc.next());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void dispDetails() {
		System.out.println(
				"Name: " + this.getName() + "\nE-mail: " + this.getEmail() + "\nUser ID: " + this.getPassword());
	}

}
