package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

public class Day9_Recursion {
	
	static  int find_gcd(int a,int b){
        //Write the base condition
		if (a == b || b == 0) {
			return a;
		}
        return find_gcd(b,a%b);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        //Take Input
		int a = sc.nextInt();
		int b = sc.nextInt();
        int gcd=find_gcd(a,b);
        System.out.println(gcd);

	}

}
