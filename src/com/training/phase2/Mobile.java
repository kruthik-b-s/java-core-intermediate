package com.training.phase2;

public class Mobile {

	String name;
	int ram;
	double price;

	{
		System.out.println("I am a non-static initializer");
	}

	static {
		System.out.println("I am a static initializer");
	}

	public Mobile() {
	}

	public Mobile(String name, int ram, double price) {
		this.name = name;
		this.ram = ram;
		this.price = price;
	}

	public void dispDetails() {
		System.out.println("Helo this is a non static method dispDetails()");
	}

	public void dispDetails(String s) {
		System.out.println(s);
	}

}
