package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

abstract class Book {
	String title;
	String author;

	Book(String t, String a) {
		title = t;
		author = a;
	}

	abstract void display();

}

class MyBook extends Book {
	private static int price;

	public MyBook(String title, String author, int price) {
		// TODO Auto-generated constructor stub
		super(title, author);
		MyBook.price = price;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);

	}

}

public class Day13_AbstractClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		String author = sc.nextLine();
		int price = sc.nextInt();
		Book new_novel = new MyBook(title, author, price);
		new_novel.display();

	}

}
