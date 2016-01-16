package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

public class Day2_Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      double M = sc.nextDouble(); // original meal price
	      int T = sc.nextInt(); // tip percentage
	      int X = sc.nextInt(); // tax percentage
	      
	      // Enter your code here!
	      // Run some computations....
	      double tip = (T * M) / 100;
	      double tax = (X * M) / 100;
	      
	      int total = (int) Math.round(M + tip + tax);
	      
	      // ...then print!
	      System.out.println("The final price of the meal is $" + total +".");

	}

}
