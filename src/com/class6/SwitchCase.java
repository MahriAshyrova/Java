package com.class6;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

//		int day=5;
//		String dayName;
//		
//		switch (day) {
//		
//		case 1:
//			dayName="Monday";
//			break;
//		case 2:
//			dayName="Tuesday";
//			break;
//		case 3:
//			dayName="Wednesday";
//			break;
//		case 4:
//			dayName="Thursday";
//			break;
//		case 5:
//			dayName="Friday";
//			break;
//		case 6:
//			dayName="Saturday";
//			break;
//		case 7:
//			dayName="Sunday";
//			break;
//		default:
//      dayName="unknown";
//		
		
		/*
		 * Prompt user to enter their country
		 * based on the country --> specify favorite food
		 */
			
	Scanner scan;
	String country;
	String favoriteFood;
	
	scan=new Scanner(System.in);
	System.out.println("Please enter your country");
	country=scan.nextLine();
	
	switch (country) {
	
	case "USA":
		favoriteFood="Burger";
		break;
	case "Russia":
		favoriteFood="Pelmeni";
		break;
	case "Turkey":
		favoriteFood="Baklava";
		break;
	case "Kazakhstan":
		favoriteFood="Beshparmak";
		break;
	case "Turkmenistan":
		favoriteFood="Dodgrama";
		break;
		default:
		favoriteFood="Unknown";	
		
		
	}
	
System.out.println("My favorite food is " +favoriteFood);		
			
	}	
		
	}


