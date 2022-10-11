package com.training.phase2;

public class ObjectCloningDriver {

	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectCloning oc = new ObjectCloning("Kruthik", "4AL19EC042", 7);
		ObjectCloning newOc = (ObjectCloning) oc.clone();

		System.out.println("Original Object: " + "\nName: " + oc.name + "\nUSN: " + oc.usn + "\nSem: " + oc.sem + "\n");

		newOc.name = "Nikhil";
		newOc.usn = "4AL19EC050";
		newOc.sem = 7;

		System.out.println(
				"Clonned Object: " + "\nName: " + newOc.name + "\nUSN: " + newOc.usn + "\nSem: " + newOc.sem + "\n");
	}

}
