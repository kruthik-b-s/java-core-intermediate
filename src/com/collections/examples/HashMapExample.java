package com.collections.examples;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(42, "kruthik");
		hm.put(47, "nayana");
		hm.put(50, "nikhil");
		hm.put(54, "pavitla");
		hm.put(66, "sanjay");
		hm.put(81, "sumanth");
		hm.put(42, "Dhana"); // values for duplicate keys get updated
		System.out.println(hm);
		hm.remove(42);
		System.out.println(hm);
		System.out.println(hm.containsKey(54) + " " + hm.containsValue("nikhil"));

		System.out.println(hm.entrySet()); // know all the pairs
		System.out.println(hm.keySet()); // only keys
		System.out.println(hm.values()); // only values
	}

}
