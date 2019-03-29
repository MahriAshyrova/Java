package com.class4;

public class NestedIfCondition {

	public static void main(String[] args) {
		/* write a program to check work eligibility 
		 * if user is less than 16, say not allowed to work
		 * else allow to work. if user is younger than 64, go to work, else do not work, enjoy your life
		 */
		
		int age = 65;
		int eligibleAge= 16;
		int retirementAge = 64;
		
		if (age<eligibleAge) {
			System.out.println("You are too young, no work for you");
		}else {
			System.out.println("You are eligible to work");
			if (age<retirementAge) {
				System.out.println("Work hard");
			}else {
				System.out.println("Enjoy your life");
			}
		}
		
		

	}

}
