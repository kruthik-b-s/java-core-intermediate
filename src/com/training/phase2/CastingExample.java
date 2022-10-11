package com.training.phase2;

public class CastingExample {
	int a = 10;

	public static void main(String[] args) {
		CastingExample ce = new CastingExample();
		System.out.println(ce);
		CastingExample newCe = new CastingExample();
//		CastingExample newCe = ce;
		newCe.a = 20;
		System.out.println(newCe);
		System.out.println(ce.a);
		System.out.println(newCe.a);
	}
}
