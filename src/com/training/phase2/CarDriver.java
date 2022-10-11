package com.training.phase2;

public class CarDriver {

	public static void main(String[] args) {
		Car c = new Car("Cullinan", "RR", 30000000, new EngineExample(6000, "V8"));
		System.out.println("Car name: " + c.name + "\nCompany: " + c.company + "\nPrice: " + c.price
				+ "\nEngine brand: " + c.e.brand + "\nEngine CC: " + c.e.cc);

	}

}
