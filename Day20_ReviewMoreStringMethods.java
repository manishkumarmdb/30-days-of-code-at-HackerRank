package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Day20_ReviewMoreStringMethods {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		StringTokenizer stringTokenizer = new StringTokenizer(string, (" [!,?."	+ "\\" + "_'@]+"));

		System.out.println(stringTokenizer.countTokens());
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
	}

}
