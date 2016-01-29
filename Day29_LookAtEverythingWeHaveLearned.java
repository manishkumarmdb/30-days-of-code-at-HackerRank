/**
 * 
 */
package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

/**
 * @author manishkumarmdb
 *
 */
public class Day29_LookAtEverythingWeHaveLearned {

	public static String getReverse(String string) {
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse += string.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T-- > 0) {
			String string = scanner.next();
			if (string.length() >= 2 && string.length() <= 10000) {
				String reverse = getReverse(string);

				boolean flag = false;
				for (int i = 1; i < string.length(); i++) {
					
					if ((Math.abs(string.charAt(i) - string.charAt(i - 1))) ==
							(Math.abs(reverse.charAt(i) - reverse.charAt(i - 1)))) {
						flag = true;

					} else {
						flag = false;
						break;
					}

				}
				if (flag) {
					System.out.println("Funny");
				} else {
					System.out.println("Not Funny");
				}
			}

		}
		scanner.close();

	}

}
