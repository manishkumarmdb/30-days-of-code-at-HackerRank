package com.hackerrank.contests.daysOfCode_30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08_DictionariesAndMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> contactListMap = new HashMap<String, Integer>();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		for (int i = 0; i < N; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			contactListMap.put(name, phone);
			in.nextLine();
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if (contactListMap.containsKey(s)) {
				System.out.println(s + "=" + contactListMap.get(s));
			} else {
				System.out.println("Not found");
			}
		}
	}

}
