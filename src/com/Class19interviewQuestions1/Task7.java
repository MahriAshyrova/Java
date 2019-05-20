package com.Class19interviewQuestions1;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		// Write a java program to check whether a given number is prime or not?
		// Prime number should meet 2 conditions: divisible by 1 and byItself ONLY
		// 2, 3, 5, 7, 11, 13, 17, 19, 23, 19
		// The number 1 is neither prime nor composite
		
	
		int num=9;
		
		boolean isPrime=true;
		
		
		for(int i=2;i<num/2; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		
		
		
		
		
		
		
	//   (num%2!=0 && num%3!=0 && num%5!=0)
		
		
		
		
		
		
		
		
		

	}

}
