package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

/**
 * @author manishkumarmdb
 *
 */

class Node24 {
	int data;
	Node24 next;

	Node24(int d) {
		data = d;
		next = null;
	}

}

public class Day24_MoreReviewMoreLinkedLists {

	public static Node24 removeDuplicates(Node24 head) {
		
		if (head == null || head.next == null) {
			return head;
		} else {
			Node24 previous = head;
			while (head.next != null) {
				if (head.next.data == head.data) {
					Node24 temp = head.next;
					head.next = head.next.next;
					temp.next = null;
				} else
					head = head.next;
			}
			return previous;
		}
	}

	public static Node24 insert(Node24 head, int data) {
		Node24 p = new Node24(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node24 start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(Node24 head) {
		Node24 start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Node24 head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}

}
