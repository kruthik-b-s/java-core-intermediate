package com.collections.examples;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.add(23);
		s.add(33);
		s.add(43);
		s.add(20);
		s.add(21);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.push(90);
		System.out.println(s);
	}

}
