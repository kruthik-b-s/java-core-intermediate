package com.threads.practice;

public class Ex {

	public static int MathChallenge(int num1, int num2) {
		int res = (int) Math.ceil((float)num1/(float)num2);
		return res;
	}
	
	public static void main(String[] args) {
		int res = MathChallenge(123212,2);
		while(res!=0) {
			System.out.print("--"+(res%10));
			res/=10;
		}
		System.out.println("--");
	}

}
