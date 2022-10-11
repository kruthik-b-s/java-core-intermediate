package com.training.phase2;

public class EncapExampleMain {
	public static void main(String[] args) {
		EncapExample ee = new EncapExample();
		System.out.println(ee.name);
		System.out.println(ee.sem);
		// System.out.println(ee.usn); // cannot access private variables
		System.out.println(ee.getUsn());

		ee.name = "Kruthik";
		ee.sem = 7;
		ee.setUsn("4AL19EC042"); // set the value to the private variable

		System.out.println("\n" + ee.name + "\n" + ee.sem + "\n" + ee.getUsn()); // get the value from the private
																					// variable
	}

}
