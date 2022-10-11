package com.training.strings;

public class DemoExample {
	public static void main(String[] args) {
//		String s1 = "hello";
//		String s2 = "hello";
		String s1 = new String("Helo");
		String s2 = new String("Helo");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.toUpperCase());
	}
}
