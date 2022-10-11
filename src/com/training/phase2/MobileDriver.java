package com.training.phase2;

public class MobileDriver {

	public static void main(String[] args) {

		Mobile m = new Mobile("Samsung", 12, 80000);

		System.out.println("\nName: " + m.name + "\nRam: " + m.ram + "\nPrice: Rs." + m.price + "\n");

		Mobile m31 = new Mobile();

		System.out.println("\nEmpty Constructor load: " + "\nName: " + m31.name + "\nRam: " + m31.ram + "\nPrice: Rs."
				+ m31.price + "\n");

		m31.dispDetails("Called by obj of empty constructor");
		m.dispDetails();

		System.out.println(m);
		System.out.println(m31);
	}

}
