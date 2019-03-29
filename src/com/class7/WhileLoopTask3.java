package com.class7;

import java.util.Scanner;

public class WhileLoopTask3 {

	public static void main(String[] args) {
		/*
		 * ask a user to pay for soda
		 * keep asking user to pay for soda until entered price is not equal to 1.99
		 * after user got a right amount print "Please enjoy the soda"
		 * 
		 */
		
//		boolean soda=true;
//		double price;
//		
//		Scanner input =new Scanner(System.in);
//		System.out.println("Please enter the price");
//		price=input.nextDouble();
//		
//		while (soda) {
//			
//			if (price==1.99 ) {
//			System.out.println("Enjoy your soda");
//			price=input.nextDouble();
//			
//			} else if (price!=1.99) {
//			System.out.println("Pay for soda");
//		    soda=false;
//		   
//		}  
//		}	
	
		Scanner scan;
		double price;
		
		Scanner input =new Scanner(System.in);
	
		do {
			System.out.println("Please pay for soda");
			price=input.nextDouble();
			System.out.println("I am inside of loop");
			
		}while (price!=1.99 );
		
		System.out.println("I am outside of loop");
		System.out.println("Enjoy your soda");
		}	
	}






