package com.class6;

import java.util.Scanner;

public class SwitchTask {

	public static void main(String[] args) {
		// ask user a country and print the language 

		String country, language;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the country");
		country=input.nextLine();
		
		
	
		
		switch (country) {
		
		
		case "Turkmenistan":
			language="Turkmen";
			break;
		case "USA":
			language="English";
			break;
		case "Turkey":
			language="Turkish";
			break;
		case "Russia":
			language="Russian";
			break;
			default:
				language="Unknown";

		}
		
		System.out.println("You language is "+language);
				
	}

}
