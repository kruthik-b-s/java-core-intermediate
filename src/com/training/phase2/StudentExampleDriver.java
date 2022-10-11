package com.training.phase2;

public class StudentExampleDriver {

	public static void main(String[] args) {
		StudentExample se1 = new StudentExample(42, "kruthik22bs@gmail.com", "kruthik");
		StudentExample se2 = new StudentExample(50, "nikhilsnayak@gmail.com", "nikhil");
		System.out.println(se1 + "\n" + se2);
		System.out.println(se1.equals(se2));
		System.out.println(se1.hashCode() + " " + se2.hashCode());
		System.out.println(se1.hashCode() == se2.hashCode());
	}

}
