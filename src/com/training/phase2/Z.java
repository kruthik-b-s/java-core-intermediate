package com.training.phase2;

public class Z extends X {
	int z = 30;

	public void m3() {
		System.out.println("m3() of Z class");
	}

	public static void main(String[] args) {
		Z o = new Z();
		o.m1();
//		o.m2();
		o.m3();
	}
}
