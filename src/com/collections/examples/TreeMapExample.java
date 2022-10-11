package com.collections.examples;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(42, "kruthik");
		tm.put(47, "nayana");
		tm.put(50, "nikhil");
		tm.put(54, "pavitla");
		tm.put(66, "sanjay");
		tm.put(81, "sumanth");
		System.out.println(tm);
	}

}
