package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

public class Day10_BinaryNumbers {
	
	public static String decimalToBinary(int number) {
		if (number == 0) {
			return "0";
		}
		String binary = "";
		while (number > 0) {
			int remainder = number % 2;
			binary = remainder + binary;
			number = number / 2;
		}
		return binary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
			int n = scanner.nextInt();
			System.out.println(decimalToBinary(n));
		}

	}

}
