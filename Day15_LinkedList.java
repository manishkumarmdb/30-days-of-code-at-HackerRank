package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

}

public class Day15_LinkedList {

	public static Node insert(Node head, int data) {
		// Complete this method

		if (head == null) {
			head = new Node(data);
			
		} else {
			Node firstNode = head;
			while (firstNode.next != null) {
				firstNode = firstNode.next;
			}
			firstNode.next = new Node(data);
		}

		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);

	}

}
