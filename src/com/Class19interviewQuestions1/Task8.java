package com.Class19interviewQuestions1;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		// Write a Java Program to print first 10 numbers of Fibonacci series.
		
		/*The fibonacci sequence is a sequence of numbers in which the next number is the sum of the previous two numbers.

		 *The first two numbers of the fibonacci sequence are 0, 1.

		 *The first 8 numbers of the fibonacci sequence are 0, 1, 1, 2, 3, 5, 8, 13

		 *Write some code to print out the first X numbers of the fibonacci sequence.

		 *Your output should be on one line, with each number separated by a space. You may assume that x is at least 2.
		 */ 
		
		//	Scanner inp = new Scanner(System.in);
		//  System.out.print("In:");
		//  int x = inp.nextInt();
	    
	   	
		int a=0;
		int b=1;
		int c;
		
		for(int i=0; i<10; i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	   		
	   		
	   		
	   		
	   	} 	
	   	
	}
	


