package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

public class Day5_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int N = scanner.nextInt();
			int power = 0;
			while (N-- > 0) {
				a += ((int) Math.pow(2, power) * b);
				System.out.print(a + " ");
				power++;
			}
			System.out.println();
		}

	}

}
