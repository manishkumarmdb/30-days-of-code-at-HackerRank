package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

public class Day3_IfElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1)
			ans = "Weird";
		else {
			// Complete the code
			if (n >= 2 && n <= 5) {
				ans = "Not Weird";
			} else if (n >= 6 && n <= 20) {
				ans = "Weird";
			} else if (n > 20) {
				ans = "Not Weird";
			}

		}
		System.out.println(ans);

	}

}
