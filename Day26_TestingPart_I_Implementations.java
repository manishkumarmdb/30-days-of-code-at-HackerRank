package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

/**
 * @author manishkumarmdb
 *
 */
public class Day26_TestingPart_I_Implementations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int date1 = in.nextInt();
		int month1 = in.nextInt();
		int year1 = in.nextInt();
		int date2 = in.nextInt();
		int month2 = in.nextInt();
		int year2 = in.nextInt();

		int fine = 0;

		if (date1 == date2 && month1 == month2 && year1 == year2
				|| date1 < date2 && month1 == month2 && year1 == year2
				|| month1 < month2 && year1 == year2 || year1 < year2) {
			System.out.println(fine);
		}

		else if (year1 > year2) {
			fine = 10000;
			System.out.println(fine);
		}

		else if (month1 == month2) {
			fine = 15 * (date1 - date2);
			System.out.println(fine);
		}

		else if (year1 == year2) {
			fine = 500 * (month1 - month2);
			System.out.println(fine);
		}
	}

}
