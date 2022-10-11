package com.training.phase2;

public class Pen {

	String brand;
	String color;
	double price;

	public Pen() {
	}

	public Pen(String color, double price) {
		this();
		this.color = color;
		this.price = price;
	}

	public Pen(String brand, String color, double price) {
		this(color, price); // constructor chaining
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Pen brand=" + brand + ", color=" + color + ", price=" + price + "\n";
	}

}
