package com.class4;

public class NestedIfAgain {

	public static void main(String[] args) {
		/* declare variable for GPA and having a diploma
		 * if user has a diploma, we can congratulate -->if GPA is higher than 3.5--> we will hire the person, else don't hire 
		 */

		double gpa=3.6;
		double expectedGpa=3.5;
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congratulations");
			if (gpa > expectedGpa) {
				System.out.println("You are hired");
			} else {
				System.out.println("Unfortunately, we cannot hire you");
			}		
			
		}else {
			System.out.println("Go get diploma");
		}
		
		
		
		
		
	}

}
