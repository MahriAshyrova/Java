package com.class4;

import java.util.Scanner;

public class Class4Task2 {

	public static void main(String[] args) {
		/* ask user what amount of loan needed
		 * if loan <200.000 lend money
		 */

	int loan;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the loan");
	loan=input.nextInt();
	System.out.println(loan);
	 if (loan<200000) {
		 System.out.println("You can get a loan"); 
	 }else {
		 System.out.println("You cannot get the loan");
	 }
	
	
	
		
	}

}
