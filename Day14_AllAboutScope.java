package com.hackerrank.contests.daysOfCode_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a) {
		// TODO Auto-generated constructor stub
		this.elements = a;
	}

	public void computeDifference() {
		// TODO Auto-generated method stub
		
		List<Integer> differentList = new ArrayList<Integer>();
		
		for (int i = 0; i < elements.length - 1; i++) {
			for (int j = i + 1; j < elements.length; j++) {
				int temp = Math.abs(elements[i] - elements[j]);
				differentList.add(temp);
			}
		}
		//System.out.println(differentList);
		Collections.sort(differentList);
		//System.out.println(differentList);
		maximumDifference = differentList.get(differentList.size() - 1);
	}

}

public class Day14_AllAboutScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Difference D = new Difference(a);

		D.computeDifference();

		System.out.print(D.maximumDifference);

	}

}
