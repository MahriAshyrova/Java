package com.interviewQuestions1;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		// Write a java program to check whether a given number is prime or not?
		// Prime number should meet 2 conditions: vivisible by 1 and byItself ONLY
		// 2, 3, 5, 7, 11, 13, 17, 19, 23, 19
		
		boolean isPrime=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number to check if it is a prime number or not");
		int num=scan.nextInt();
		
		for (int i = 2; i < num; i++) {
            if (num % i != 0) {  
		   } else {
			   isPrime=false; 
			   break;
		   }  
		}
		System.out.println(isPrime);
	
		

	}

}
