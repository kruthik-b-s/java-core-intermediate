package com.training.phase2;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();

		for (int i = 1; i <= val; i++) {
			for (int j = 1; j <= i; j++) {
				if (i == 1 || j == 1 || j == i || i == val) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
		sc.close();
	}

}
