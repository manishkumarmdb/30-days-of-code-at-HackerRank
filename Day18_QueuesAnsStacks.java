package com.hackerrank.contests.daysOfCode_30;

import java.util.LinkedList;
import java.util.Scanner;

class Palindrome {
	LinkedList<Character> stacks;
	LinkedList<Character> queues;
	
	public Palindrome() {
		// TODO Auto-generated constructor stub
		stacks = new LinkedList<Character>();
		queues = new LinkedList<Character>();
	}
	
	public void pushCharacter(char c) {
		// TODO Auto-generated method stub
		stacks.push(c);
		
	}
    //Write your code here

	public void enqueueCharacter(char c) {
		// TODO Auto-generated method stub
		queues.addLast(c);
		
	}

	public Character popCharacter() {
		// TODO Auto-generated method stub
		return (Character) stacks.pop();
	}

	public Character dequeueCharacter() {
		// TODO Auto-generated method stub
		return (Character) queues.remove();
	}

}

public class Day18_QueuesAnsStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        // read the string s.
        String s = sc.nextLine();
        
        // create the Palindrome class object p.
        Palindrome p = new Palindrome();
        char arr[]=s.toCharArray();//Converting string to a character array
        // push all the characters of string s to stack.
        for (char c : arr) {
            p.pushCharacter(c);
        }
        
        // enqueue all the characters of string s to queue.
        for (char c : arr) {
            p.enqueueCharacter(c);
        }
        
        boolean f = true;
        
        // pop the top character from stack.
        // dequeue the first character from queue.
        // compare both the characters.
        for (int i = 0; i < s.length(); i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
                f = false;
                
                break;
            }
        }
        
        // finally print whether string s is palindrome or not.
        if (f) {
            System.out.println("The word, "+s+", is a palindrome.");
        } else {
            System.out.println("The word, "+s+", is not a palindrome.");
        }

	}

}
