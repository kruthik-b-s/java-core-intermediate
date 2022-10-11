package com.training.strings;

public class WrapperExample {

	public static void main(String[] args) {
		Integer k = 25; // auto boxing
//		System.out.println(k);
		int i = k.intValue(); // auto unboxing
		System.out.println(i);
	}

}
