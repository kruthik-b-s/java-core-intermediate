package com.training.phase2;

public class BusDriver {

	public static void main(String[] args) {
		Bus b = new Bus(42, "KSRTC");
		System.out.println("\nBus number: " + b.num + "\nBus Company: " + b.company);
		b.boardPassenger(new Passenger("Nikhil S", 21, "Male"));
	}

}
