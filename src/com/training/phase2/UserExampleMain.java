package com.training.phase2;

import java.util.Scanner;

public class UserExampleMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		UserExample ue = new UserExample();

		ue.setName(sc.nextLine());
		ue.setEmail(sc.next());
		int pass = sc.nextInt();
		ue.setPassword(pass);

		System.out.println("1 to reset password else any key");
		int key = sc.nextInt();
		if (key == 1) {
			ue.setPassword(pass);
		}

		ue.dispDetails();
		sc.close();
	}

}
