package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

public class Day06_LetsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			int count = 0;
			while (count != (n - (i + 1))) {
				System.out.print(" ");
				count++;
			}
			for (int j = (n - i); j <= n; j++) {
				System.out.print("#");
			}
			System.out.println();
			
		}
	}

}
