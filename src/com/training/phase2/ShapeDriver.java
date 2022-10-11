package com.training.phase2;

public class ShapeDriver {
	public static void main(String[] args) {
//		Shape s = new Circle(); // upcasting
		Circle c = new Circle();
		Shape sp = c;
		System.out.println(c.area);
		System.out.println(c.radius);
		System.out.println(sp.area);
//		System.out.println(sp.radius); // radius not accessible

//		Shape s = new Shape();
		Circle cl = (Circle) sp; // downcasting can be done only after upcasting
		System.out.println(cl.area);
		System.out.println(cl.radius);
		System.out.println(sp.area);
	}
}
