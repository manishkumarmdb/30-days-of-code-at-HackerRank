package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator19 implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}

}

public class Day19_Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		AdvancedArithmetic myCalculator = new Calculator19();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: AdvancedArithmetic\n" + sum);

	}

}
