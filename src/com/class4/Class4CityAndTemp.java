package com.class4;

import java.util.Scanner;

public class Class4CityAndTemp {
	public static void main(String[] args) {
		
		/* ask user to input city and temperature
		 * convert F-->C 
		 * print ...
		 */
		
		String cityName;
		int temp;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your city");
		cityName=input.nextLine();
		System.out.println("Enter the temperature");
		temp=input.nextInt();
		
		int convertedTemp =(temp-32)*5/9;
		
	System.out.println("The temperature in "+cityName+ " is " +convertedTemp+ "C");
		
	}

}
