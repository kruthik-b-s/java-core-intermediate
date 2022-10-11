package com.training.phase2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();

		for (int i = 0; i < val; i++) {
			for (int j = 0; j < val; j++) {
				if (i == 0 || j == 0 || i == val - 1 || j == val - 1) {
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
