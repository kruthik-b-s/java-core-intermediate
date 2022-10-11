package com.training.phase2;

public class OverridingDriver {

	public static void main(String[] args) {
		OverridingExample oe = new OverridingExample() {
			@Override
			public String toString() {
				return a + " do you see the number?";
			}

			@Override
			public boolean equals(Object obj) {
				if (obj instanceof OverridingExample) {
					OverridingExample o = (OverridingExample) obj;
					return this.a == o.a;
				} else {
					return false;
				}
			}
		};

		OverridingExample newOe = new OverridingExample();
		System.out.println(oe);
		System.out.println(oe.equals(newOe));

	}

}
