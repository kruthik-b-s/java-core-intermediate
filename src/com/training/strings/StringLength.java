package com.training.strings;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = s.lastIndexOf("");
		System.out.println(count);
		sc.close();

	}

}
