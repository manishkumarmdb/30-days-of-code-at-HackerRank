package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

class Student {
	protected String firstName;
	protected String lastName;
	int phone;

	Student(String fname, String lname, int p) {
		firstName = fname;
		lastName = lname;
		phone = p;

	}

	public void display() {// display the details of the student
		System.out.println("First Name: " + firstName + "\nLast Name: "
				+ lastName + "\nPhone: " + phone);
	}

}

class Grade extends Student {
	private int score;

	public Grade(String firstName, String lastName, int phone, int score2) {
		super(firstName, lastName, phone);
		this.score = score2;
		// TODO Auto-generated constructor stub
	}

	char calculate() {

		if (score < 40) {
			return 'D';
		}
		else if (score >= 40 && score < 60) {
			return 'B';
		}
		else if (score >= 60 && score < 75) {
			return 'A';
		}
		else if (score >= 75 && score < 90) {
			return 'E';
		}
		else if (score >= 90 && score <= 100) {
			return 'O';
		}

		return 0;

	}

}

public class Day12_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		int phone = sc.nextInt();
		int score = sc.nextInt();
		Student stu = new Grade(firstName, lastName, phone, score);
		stu.display();
		Grade g = (Grade) stu;
		System.out.println("Grade: " + g.calculate());

	}

}
