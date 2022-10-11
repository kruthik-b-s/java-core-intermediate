package com.collections.examples;

import java.util.Objects;

public class ArrayListMain implements Comparable<Object>{
	int val;
	String data;
	
	public ArrayListMain(int val, String data) {
		this.val = val;
		this.data = data;
	}

	@Override
	public String toString() {
		return "ArrayListMain [val=" + val + ", data=" + data + "]\n";
	}

	@Override
	public int compareTo(Object o) {
		ArrayListMain alm = (ArrayListMain)o;
		return this.val - alm.val;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, val);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ArrayListMain) {
			ArrayListMain arm = (ArrayListMain)obj;
			return (this.data == arm.data) && (this.val == arm.val);
		}
		return false;
	}
	
	
}
