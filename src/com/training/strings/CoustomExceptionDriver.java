package com.training.strings;

public class CoustomExceptionDriver {
	
	

	public static void main(String[] args) {
		try {
			exception();
		} catch (CoustomException e) {
			System.out.println(e);
		}
	}
	
	public static void exception() throws CoustomException{
		String name = "Kruthik B S";
		int id = 42;
		if (id < 45) {
			throw new CoustomException(name + " not in B section!!");
		} else {
			System.out.println(name + " in A section!!");
		}
	}

}
