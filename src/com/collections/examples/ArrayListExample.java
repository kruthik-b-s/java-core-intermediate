package com.collections.examples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
//		al1.add(42);
//		al1.add("Kruthik");
//		al1.add('A');
//		al1.add(25.5);
//		
//		ArrayList al2 = new ArrayList();
//		al2.add(42);
//		al2.add("Kruthik");
//		al2.add('A');
		al1.add(23);
		al1.add(21);
		al1.add(65);
		al1.add(32);
		al1.add(67);
		al1.add(22);
		al1.add(12);
		al1.add(28);
		al1.add(88);
		al1.add(11);

		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);

		ArrayList<ArrayListMain> al2 = new ArrayList<ArrayListMain>();
		al2.add(new ArrayListMain(1, "Hi"));
		al2.add(new ArrayListMain(3, "Helo"));
		al2.add(new ArrayListMain(2, "Hehe"));
		
		Collections.sort(al2);

		System.out.println(al2);
//		al2.add(25.5);

//		al1.retainAll(al2);
//		al1.removeAll(al2);
//		System.out.println(al1);
//		System.out.println(al);
//
//		Iterator i = al.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
//
//		ListIterator li = al.listIterator();
//		while(li.hasNext()) {
//			li.next();
//		}
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
	}

}
