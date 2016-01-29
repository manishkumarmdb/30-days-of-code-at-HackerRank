package com.hackerrank.contests.daysOfCode_30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author manishkumarmdb
 *
 */

class Node23 {
	Node23 left, right;
	int data;

	Node23(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day23_ReviewBinaryTree {

	static void levelOrder(Node23 root) {
		// Write your code here

		Queue<Node23> queue = new LinkedList<Node23>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node23 tempNode = queue.poll();
			System.out.printf("%d ", tempNode.data);
			if (tempNode.left != null)
				queue.add(tempNode.left);
			if (tempNode.right != null)
				queue.add(tempNode.right);
		}

	}

	public static Node23 insert(Node23 root, int data) {
		if (root == null) {
			return new Node23(data);
		} else {
			Node23 cur;
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
		Node23 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);

	}

}
