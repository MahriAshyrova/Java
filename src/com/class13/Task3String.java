package com.class13;

import java.util.Scanner;

public class Task3String {

	public static void main(String[] args) {
		/* Write a program that reads two people’s first names and if they expecting boy or girl? Based on the input suggests a name for a baby:
		Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY

			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL
*/
		
	
		Scanner scan=new Scanner (System.in);
		System.out.println("What is your monther's name?");
		String momName=scan.nextLine();
		System.out.println("What is your fathers's name?");
		String dadName=scan.nextLine();
		System.out.println("Please enter the gender!");
		String gender=scan.nextLine();
		
		if(gender.equalsIgnoreCase("boy")) {
		System.out.println("Suggested baby name: "+dadName.substring(0, dadName.length()/2).toUpperCase()+momName.substring(momName.length()/2).toUpperCase());	
		} else if(gender.equalsIgnoreCase("girl")) {
			System.out.println("Suggested baby name: "+momName.substring(0, momName.length()/2).toUpperCase()+dadName.substring(dadName.length()/2).toUpperCase());
		}else {
			System.out.println("Invalid gender");
		}
		
		
		
		Scanner input; 
		String motherName,fatherName, gender1, babyName;
		
		input=new Scanner(System.in);
		System.out.println("Please enter mothers name");
		motherName=scan.nextLine();
		
		System.out.println("Please enter fathers name");
		fatherName=scan.nextLine();
		
		System.out.println("Please enter expected gender");
		gender1=scan.nextLine();
		
		
		if(gender1.equalsIgnoreCase("boy")) {
			babyName=fatherName.substring(0, fatherName.length()/2)+
					motherName.substring(motherName.length()/2);
		}else if(gender1.equalsIgnoreCase("girl")){
		babyName=motherName.substring(0, motherName.length()/2)+
				fatherName.substring(fatherName.length()/2);
		}else {
			babyName="No suggestion";
			
		}
		System.out.println(babyName.toUpperCase());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
