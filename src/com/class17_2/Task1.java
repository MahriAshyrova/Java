package com.class17_2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point), provided by a user and then 
		// from that range prints the sum of the even and odd integers.
		Task1 task = new Task1();
		task.oddEven();
		
		
		
	}
	
	void oddEven() {
	int sumEven=0, sumOdd=0;
		
	Scanner input= new Scanner (System.in);	
	System.out.println("Please enter 2 integers");
	int startRange=input.nextInt();	
	int endRange=input.nextInt();	
	
	
	if (startRange<endRange) {
	
	for (int a=startRange; a<=endRange; a++) {

		if (a%2==0) {
			sumEven+=a;
		}else {
			sumOdd+=a;	
		}	
	}
	System.out.println("The sum of even numbers is " +sumEven);	
	System.out.println("The sum of odd numbers is "+sumOdd);	
    
	
	}
	
	}
}
