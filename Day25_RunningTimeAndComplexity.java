package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

/**
 * @author manishkumarmdb
 *
 */
public class Day25_RunningTimeAndComplexity {

	public static boolean isPrime(long number) {

		if (number < 2)
			return false;
		if (number == 2)
			return true;
		if (number % 2 == 0)
			return false;
		for (long i = 3; (i * i) <= number; i += 2) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
			long N = scanner.nextInt();
			if (N >= 1 && N <= (long) (2 * (Math.pow(10, 9)))) {
				// print the number
				if (isPrime(N)) {
					System.out.println("Prime");
				} else {
					System.out.println("Not prime");
				}

			}
		}

	}

}
