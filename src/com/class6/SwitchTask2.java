package com.class6;

import java.util.Scanner;

public class SwitchTask2 {

	public static void main(String[] args) {
		// allow user create a program and then provide explanation
		// A=excellent, B=Good, ...

	String grade, expl;
	
		
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter your grade");
	grade=input.nextLine();
	
	
	switch (grade) {
	
	case "A":
		expl="Excellent";
		break;
	case "B":
		expl="Good";
		break;
	case "C":
		expl="Average";
		break;
	case "D":
		expl="Bad";
		break;
	default:
		expl="Not Acceptable";
	}
	System.out.println("Your grade is " +expl);	
	}

}
