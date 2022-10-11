package com.training.phase2;

import java.util.Scanner;

public class Bus {
	int num;
	String company;
	Passenger p;

	Scanner sc = new Scanner(System.in);

	public Bus(int num, String company) {
		this.num = num;
		this.company = company;
	}

	public void boardPassenger(Passenger p) {
		System.out.println("Passenger name: " + p.name);
		System.out.println("Passenger age: " + p.age);
		System.out.println("Passenger gender: " + p.gender);
	}

}
