package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		/*
		 * prompt user to ask the name 3 times and print "You are doing great __"
		 */
		
		String name;
		
		
		Scanner input=new Scanner(System.in);
	
		int a=1;
		
		while (a<=3) {
			System.out.println("What is your name?");
			name=input.nextLine();
			
			System.out.println("You are doing great "+name);
			
			a++;
		}
				
		
		
	}

}
