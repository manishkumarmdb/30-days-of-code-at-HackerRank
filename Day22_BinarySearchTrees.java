package com.hackerrank.contests.daysOfCode_30;

import java.util.Scanner;

class Node22 {
	Node22 left, right;
	int data;

	Node22(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day22_BinarySearchTrees {

	public static int getHeight(Node22 root) {
		// Write your code here
		if (root == null) {
			return 0;
		} else {
			// with recursion....
			// return 1 + Math.max(getHeight(root.left), getHeight(root.right));
		}

		
		int left_Height = getHeight(root.left);
		int right_Height = getHeight(root.right);
		
		if (left_Height > right_Height) {
			return left_Height + 1;
			
		} else {
			return right_Height + 1;
		}
	}

	public static Node22 insert(Node22 root, int data) {
		if (root == null) {
			return new Node22(data);
		} else {
			Node22 cur = new Node22(data);
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node22 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);

	}

}
