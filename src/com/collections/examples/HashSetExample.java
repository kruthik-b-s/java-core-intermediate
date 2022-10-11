package com.collections.examples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>();
//		HashSet<Integer> hs = new HashSet<Integer>();
//		Set set = new HashSet();
//		set.add("my");
//		set.add("name");
//		set.add("is");
//		set.add("kruthik");
//		set.add("is");
//		System.out.println(set);
		Set<ArrayListMain> s = new HashSet<ArrayListMain>();
		s.add(new ArrayListMain(1, "niki"));
		s.add(new ArrayListMain(2, "pavi"));
		s.add(new ArrayListMain(1, "suman"));
		s.add(new ArrayListMain(1, "naya"));
		s.add(new ArrayListMain(1, "gagu"));
		s.add(new ArrayListMain(1, "nadi"));
		s.add(new ArrayListMain(1, "nadi"));
		s.add(new ArrayListMain(2, "pavi"));
		System.out.println(s);
		s.remove(new ArrayListMain(1, "gagu")); // same passes during add
		System.out.println(s);
	}

}
