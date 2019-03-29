package com.class5;

import java.util.Scanner;

public class Class5Task1 {

	public static void main(String[] args) {
		/*
		 * Prompt the user to enter person's height in inches. Each person should be classified as one of the following: 
		 * short (under 5 inch)
		 * medium(5 to 6 inch)
		 * tall (6 inch and over)
	     */
		
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter person's height in inches");
		double height=input.nextDouble();
		
	    
		
			
			if (height==5 || height<6) {
				System.out.println("You are medium");
			} else if (height<5) {
					System.out.println("You are short");
			}else if (height>=6) {
				System.out.println("You are tall");	
			}else {
					System.out.println("Not valid");		
			}
			
	}

}
