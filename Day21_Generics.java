package com.hackerrank.contests.daysOfCode_30;

import java.lang.reflect.Method;

class Printer
{

   //Write your code here
	public void printArray(Object[] object) {
		// TODO Auto-generated method stub
		for (Object output : object) {
			System.out.println(output);
		}
		
	}

}

public class Day21_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer myPrinter=new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello","World"};
        myPrinter.printArray( intArray  );
        myPrinter.printArray( stringArray );
        int count=0;
		for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
              count++;
        }
        
        if(count>1)System.out.println("Method overloading is not allowed!");
        assert count==1;


	}

}
