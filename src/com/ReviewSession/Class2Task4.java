package com.ReviewSession;

import java.util.Scanner;

public class Class2Task4 {
	public static void main (String [] args) {
		
	
	String name;
	String gender;
	int age;
	long mobile;
	
	
		
	Scanner input = new Scanner(System.in);
	System.out.println("What is your name?");
	name = input.nextLine();
	
	
	System.out.println("What is your gender?");
	gender = input.nextLine ();
	
	
	System.out.println("What is your age?");
	age = input.nextInt();	
	
	
	System.out.println("What is your mobile?");
	mobile = input.nextLong();	
	
	
	
	System.out.println("Name: " +name);
	System.out.println("Gender: " +gender);
	System.out.println("Age: " +age);	
	System.out.println("Mobile: " +mobile);
		
	}

}
