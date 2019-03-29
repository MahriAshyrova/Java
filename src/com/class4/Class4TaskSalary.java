package com.class4;

import java.util.Scanner;

public class Class4TaskSalary {

	public static void main(String[] args) {
		/* ask users to enter numbers of years they have worked and annual salary
		 * If user worked > = to 5 years --> eligible for bonus, else not.
		 * if user is eligible and salary is >50000 -->bonus = 5000, else bonus = 3000
		 */
		
		
		int years;
		int salary;

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of years worked");
		years=input.nextInt();
		System.out.println("Enter the annual salary");
		salary=input.nextInt();
		
		if (years>=5) {
			System.out.println("You are eligible for bonus");
			if (salary >=650000) {
				System.out.println("Your bonus is 5000");
	        }else {
		    System.out.println("Your bonus is 3000");
	        }
	} else {
		System.out.println("You are not eligible for bonus");		
		
	}	

	}

}
