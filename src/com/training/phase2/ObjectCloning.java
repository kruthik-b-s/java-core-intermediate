package com.training.phase2;

public class ObjectCloning implements Cloneable {
	String name;
	String usn;
	int sem;

	public ObjectCloning(String name, String usn, int sem) {
		super();
		this.name = name;
		this.usn = usn;
		this.sem = sem;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
