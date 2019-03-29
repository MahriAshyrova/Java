package com.ReviewSession;

import java.util.Scanner;

public class Class3Review {

	public static void main(String[] args) {
		
		        // Write a program to find out what to do for the following temperatures
                // Temperatures is greater than 100 print out Stay inside it's too hot
                // temperatures is greater than 50 and less than 99 print out Wear summer clothes
                // temperatures is greater than 30 and less than 49 print out Wear winter clothes
                // temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
                // lastly if the temperature  is lower than that print out Call for help it's too cold outside
		
int temp = 0;
String output; 
		
	if(temp>=100)	{
	 output="Stay inside it is too hot";	
	}else if (temp>=50 && temp<=99) {
		output="Wear summer clothes";
	}else if (temp>=30 && temp<=49) {
		output="Wear winter clothes";
	}else if (temp>=10 && temp<=29) {
		output="Stay inside it is too cold";
	}else {
		output="Help, it is too cold";
	}
	System.out.println(output);
	
	
	
	// Write a program that allows a user to input age to find out if the user is either Too Young, Young Person, Middle Age Person, or  too Old
    // Age should NOT be greater than 18  print out  Too Young
    // Age should be between 18 and 35 inclusive  print out Young Person
    // Age should greater 36 or less than or equal to 60 inclusive print out  You are Middle Age Person
    // If the age is greater than 100 print print out  You are too Old
    // Create an int variable named age
    // Must use a Scanner
    
	
//	int age;
//	String out;
//	
//	Scanner input = new Scanner (System.in);
//	System.out.println("Please enter your age");
//	age=input.nextInt();
//	
//	
//	if (!(age>18 || age!=18)) {
//		out="Too young";
//	}else if (age >=18 && age <=35) {
//		out="Young person";
//	}else if (age>=36 || age <=90) {
//		out="Middle age person";
//	}else if (age>=100) {
//		out="You are too old";
//	}else {
//		out="Not valid";
//	}
//	System.out.println(out);
	
	
	
//	int day;
//	String outcome;
//	
//	Scanner in=new Scanner(System.in);
//	System.out.println("Please enter the day of the week");
//	day=in.nextInt();
//	
//	switch (day) {
//	case 1:
//		outcome="Monday";
//		break;
//	case 2:
//		outcome="Tuesday";
//		break;
//	case 3:
//		outcome="Wednesday";
//		break;
//	case 4:
//		outcome="Thursday";
//		break;
//	case 5:
//		outcome="Friday";
//		break;
//	case 6:
//		outcome="Saturday";
//		break;
//	case 7:
//		outcome="Sunday";
//		break;
//	default:
//		outcome="unknown";
//	}
//	System.out.println(outcome);
//	
		
	

	
	
	// Write a program to found out the user level of experience
    // Must use a switch statement with  a String variable named levelString and a int variable named level  
    // Beginner level should be 1
    // Intermediate level should be 2
    // Expert level should be 3
	
	
	String levelString;
	int level;
	
	
	Scanner input =new Scanner(System.in);
	System.out.println("Please enter the year of experience");
	level=input.nextInt();
	
	switch (level) {
	case 1:
		levelString="Beginner";
		break;
	case 2:
		levelString="Intermediate";
		break;
	case 3:
		levelString="Expert";
		break;
	default:
		levelString="Not valid";
	}
	
	System.out.println(levelString);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}


















