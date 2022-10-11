package com.training.phase2;

public class StudentExample {
	int id;
	String email;
	String name;

	public StudentExample() {

	}

	public StudentExample(int id, String email, String name) {

		this.id = id;
		this.email = email;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentExample [id=" + id + ", email=" + email + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof StudentExample)) {
			return false;
		}
		StudentExample se = (StudentExample) obj;
		return se.name == this.name;
	}

}
