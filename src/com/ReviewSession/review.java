package com.ReviewSession;

import java.util.Scanner;

public class review {

	public static void main(String[] args) {
		
		
		// let user define a range of numbers to print 
		
	int num1, num2, num3; 
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter 3 integer numbers");
	num1=input.nextInt();
	num2=input.nextInt();
	num3=input.nextInt();
	
	while (num1>num2 && num1>num3) {
			System.out.println(num1+ " is the largest");
	} if (num2>num1 && num2>num3) {
			System.out.println(num2+ " is the largest");
		}else if (num3>num1 && num3>num2) {
			System.out.println(num3+ " is the largest");
		}
	
		
		
		
		
		
	}}

		
	


