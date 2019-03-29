package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
	public static void main(String[] args) {
		
		/* ask user to enter city and temperature in F
		 * your program should convert F to C
		 * your temperature in the city _ is _
		 */
		
		String cityName;
		int temp;
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Please enter your city");
		
		cityName= myScanner.nextLine();
		
		System.out.println("Please enter temperature in F");
		
		temp=myScanner.nextInt();
		
		//formula (F-32) * 5/9;
		
		
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("the temperature in the city " +cityName+ " is " +convertedTemp+ "C");
		
		
		
		
		
		
	}

}
