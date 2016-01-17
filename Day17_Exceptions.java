package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

class Calculator {
	int power(int n, int p) throws Exception {
		Integer output = null;
		if (n > -1 && p > -1) {
			output = (int) Math.pow(n, p);
		} else {
			//output = Integer.parseInt("n and p should be non-negative");
			throw new Exception("n and p should be non-negative");
		}
		return output;
	}
}

public class Day17_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
