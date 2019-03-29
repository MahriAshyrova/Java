package com.class5;

import java.util.Scanner;

public class Class5Task2 {

	public static void main(String[] args) {
		/*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
			* if the average score >=90 =>grade=A
			* if the average score >= 70 and <90 => grade=B
			* if the average score>=50 and <70 =>grade=C
			* if the average score<50 =>grade=F
			*/
		
		int quiz;
		int midTerm;
		int fin;
		int aver;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter the quiz"); 
		quiz=input.nextInt();
		System.out.println("Please enter the midTerm");
		midTerm=input.nextInt();
		System.out.println("Please enter the fin");
		fin=input.nextInt();
		
		aver=(quiz+midTerm+fin)/3;
		System.out.println("Avarage srore is "+aver);
		
	if (aver >=90)	{
		System.out.println("Your grade is A");
	}else if (aver >=70 && aver<90 ){
		System.out.println("Your grade is B");
	}else if (aver >=50 && aver<70 ){
		System.out.println("Your grade is C");
	}else if (aver<50 ){
		System.out.println("Your grade is F");
	
	}else {
		
	System.out.println("Not valid");
	
	}
	}
}
