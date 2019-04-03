package com.interviewQuestions1;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		// Write a Java Program to find whether a String is palindrome or not?
		// palindrone examples: madam, civic, refer

	String reverse=""; 	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter any word to check if it is palidrome or not!");
	String word=scan.nextLine();
	
	
	for (int i=word.length()-1; i>=0; i-- ) {
		reverse=reverse+word.charAt(i);
	}
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("Reversed String is "+reverse+", the String is palidrome");		
		}else {
			System.out.println("The String is not palidrome");
		}
		

	}

}
