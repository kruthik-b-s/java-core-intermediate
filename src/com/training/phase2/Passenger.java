package com.training.phase2;

public class Passenger {
	String name;
	int age;
	String gender;

	public Passenger(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Passenger \nname=" + name + "\nage=" + age + "\ngender=" + gender;
	}

}
