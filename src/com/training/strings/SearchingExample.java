package com.training.strings;

public class SearchingExample {

	public static void main(String[] args) {
		int[] a = { 23, 21, 45, 32, 65, 2 };
		int b = 45;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				System.out.println("found at " + i);
				break;
			}
		}
	}

}
