package com.class5;

import java.util.Scanner;

public class LogicalOperationsTask {

	public static void main(String[] args) {
		/*
		 * write a program that prints out if it is good weather to go for activity or
		 * not if the the temperature is between 40 degrees and 80 degrees inclusive &
		 * no rain --> we will go hiking otherwise, we will not go hiking if temperature
		 * is between 25 and 40 inclusive & snowing --> going snow boarding otherwise we
		 * are not going snow boarding otherwise --> not going to the beach
		 */

		boolean sunny, rain, snow;
		int temp;
		String activity="";

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your temperature");
		temp = input.nextInt();
		
	if (temp >= 40 && temp <= 80) {
			System.out.println("Is it raining?");
			rain = input.nextBoolean();
			
		if(rain) {
			activity="watchmovie";
		}else {
			activity = "gohiking";	
		}
		
		
	}else if (temp >= 25 && temp < 40) {	
			System.out.println("Is it snowing?");
			snow = input.nextBoolean();
			if (snow) {
			activity = "snowboarding";
		} else {
			activity = "docoding";
		}
			
		
	}else if (temp > 80) {
			System.out.println("Is it sunny?");
			sunny = input.nextBoolean();
				if (sunny) {
				activity = "gotothebeach";
			} else {
				activity = "morecoding";
			}
	
	}else{

		System.out.println("Please enter the different temperature");
		// activity = "unknown";
	}

	System.out.println("My activity for today is "+activity);
}
}
