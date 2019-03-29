package com.class5;

import java.util.Scanner;

public class Class5HomeworkPractice {

	public static void main(String[] args) {
		// program to find the largest number among the three using nested if provided by a user 
		// numbers must be distinct 
		
		
		// num1 >num2 & num1>num3
		// num2 >num1 & num2>num3
		// num3 >num1 & num3>num2

		int num1, num2, num3, largest;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter 3 distinct double values");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if (!(num1==num2 && num1==num3 && num2==num3)){
		
		
		if(num1>num2) {
			
			if (num1>num3) {
			largest=num1;
		}else {
			largest=num3;
		}
		}else{   //assuming num2>num1
			if (num2>num3) {
				largest=num2;
			}else {
				largest=num3;
			}
		}
		}else {
		System.out.println("All numbers are equal");
		}
//System.out.println("The largest number is " +largest);
	}
	}	


		