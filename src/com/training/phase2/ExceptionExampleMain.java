package com.training.phase2;

public class ExceptionExampleMain {

	public static void main(String[] args) throws ExceptionExample {
		int a = 20;
		int b = 10;
		exception(a, b);

	}

	public static void exception(int a, int b) throws ExceptionExample {
		if (a > 10 && b > 10) {
			System.out.println(a + b);
		} else {
			throw new ExceptionExample("Fuck you Sumanth");
		}
	}

}
