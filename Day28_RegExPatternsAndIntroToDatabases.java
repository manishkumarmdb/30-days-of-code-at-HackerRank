/**
 * 
 */
package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @author manishkumarmdb
 *
 */
public class Day28_RegExPatternsAndIntroToDatabases {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			// Write your code
			PatternSyntaxException pse = null;
			try {
				Pattern.compile(pattern);
			} catch (PatternSyntaxException ex) {
				pse = ex;
			}
			if (pse == null) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
			testCases--;
		}
		in.close();
	}

}
