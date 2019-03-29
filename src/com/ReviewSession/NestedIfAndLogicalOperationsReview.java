package com.ReviewSession;

import java.util.Scanner;

public class NestedIfAndLogicalOperationsReview {

	public static void main(String[] args) {
		/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
		* if the average score >=90 =>grade=A
		* if the average score >= 70 and <90 => grade=B
		* if the average score>=50 and <70 =>grade=C
		* if the average score<50 =>grade=F
		*/
	
		int quiz, mTerm, fScore;

		Scanner input =new Scanner(System.in);
		System.out.println("Please enter your quiz, midterm, and final score");
		quiz=input.nextInt();
		mTerm=input.nextInt();
		fScore=input.nextInt();
		
		
	    int aver=(quiz+mTerm+fScore)/3;
	    System.out.println("Your average is " +aver);
		
		if(aver>=90) {
			System.out.println("Your grade is A");
		}else if (aver>=70 && aver<90) {
			System.out.println("Your grade is B");
		}else if ((aver>=50 && aver<70)){
			System.out.println("Your grade is C");
			
		}else if (aver<50){
			System.out.println("Your grade is D");
		}	else {
			System.out.println("No output");
		}
			
		
	}

}
