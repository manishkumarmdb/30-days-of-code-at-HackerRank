package com.hackerrank.contests.daysOfCode_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day16_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		List<Integer> listA = new ArrayList<Integer>();
		
		for (int i = 0; i < N; i++) {
			listA.add(scanner.nextInt());
		}
		Collections.sort(listA);
		//System.out.println(listA);
		
		List<Integer> listDifference = new ArrayList<Integer>();
		Integer difference = null;
		for (int i = 0; i < listA.size() - 1; i++) {
			difference = Math.abs(listA.get(i) - listA.get(i + 1));
			listDifference.add(difference);
		}
		//System.out.println(listDifference);
		Collections.sort(listDifference);
		//System.out.println(listDifference);
		//System.out.println(listDifference.get(0));
		
		//List<Integer> outputList = new ArrayList<Integer>();
		for (int i = 0; i < listA.size() - 1; i++) {
			if (Math.abs((listA.get(i) - listA.get(i + 1))) == listDifference.get(0)) {
				//outputList.add(listA.get(i));
				//outputList.add(listA.get(i + 1));
				System.out.print(listA.get(i) + " " + listA.get(i + 1) + " ");
				
			}
		}
		//System.out.println(outputList);

	}

}
