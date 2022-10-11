package com.training.strings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
//		try {
////		System.out.println(a / b);
//		String s = "kruthik";
//		char ch = s.charAt(9);
//		}catch(ArithmeticException e){
//			System.out.println("Hey fu**** you are dividing by 0!!!");
//		}
		try {
			FileInputStream fi = new FileInputStream("abc.txt");
			System.out.println(a + " " + b);
			System.out.println(fi);
		} catch (FileNotFoundException e) {
			System.out.println("handled");
		}
	}
}
