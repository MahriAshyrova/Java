package com.class17;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Write a guessing game where the user has to guess a secret number between 1 and 20.
		 *  After every guess input, the program tells the user whether their number was too large or too small. 
		 *  The program will keep asking the user to enter the number until he finds the correct number.
		 *  When the correct answer is found the system should display "Congratulations!!. You got it!".
		 */
		
		int secretNumber=11;
		Scanner input=new Scanner (System.in);
		
		for (int a=1; a<=20; a++) {
			System.out.println("Please enter to guess the secret number");
			int num=input.nextInt();	
			if (num>20) {
				System.out.println("This number is too large");
			}if (num<secretNumber) {
				System.out.println("This number is small");
			}	
			if (num==secretNumber) {
				System.out.println("Congratulations! You got it");
				break;	
			}	
		}
		System.out.println();
		
	//____________________________________
		
		Scanner scan;
		int secret=13, userNumber;
		scan=new Scanner(System.in);
		System.out.println("Please enter any number from 1-20");
		
	do {
		
		userNumber=scan.nextInt();
		if (userNumber<secret) {
			System.out.println("The number is too small, try again");
		}else if (userNumber>secret) {
			System.out.println("The number is too large, try again");
		} 
	}	while (secret!=userNumber);
	System.out.println("Congratulations!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}	
	}
	


