package com.class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password and check following requirements:

	Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
	Password should be minimum 8 characters, if less → message=”Password is too short”.
	Password cannot contain username if so, → message=”Password cannot contain username”.
	Password should match confirmed password, if not  → message “Passwords do not match”.
	Only after all requirements met → message “Your username and password has been created”
	PLEASE DO NOT SEND ANSWERS TO THE CHAT
		 * 
		 * 
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the user name:");
		String name=scan.nextLine();
		System.out.println("Please enter your password:");
		String password=scan.nextLine();
		System.out.println("Please confirm your password:");
		String confirmPassword=scan.nextLine();

		
		if (!(name.isEmpty() && password.isEmpty())) {
			if (password.length() > 8) {
				if (!(password.contains(name))) {
					if (password.equals(confirmPassword)) {
						System.out.println("Your user name and password has been created");

					} else {
						System.out.println("Passwords do not match");

					}
				} else {
					System.out.println("Password cannot contain username");
				}
			} else {
				System.out.println("Password is too short");
			}
		} else {
			System.out.println("Username and Password cannot be empty");
		}

		 
	

	}
		
}	
		
		
		
		
		
		
		