package com.class20;

public class Task1 {

	
	
	public static void main(String[] args) {
		
		/* Create a method createEmail().
        * Based on provided users name, lastName and email type,
        * your method should return complete email Address;
        * johnsnow@gmail.com
        * johnsnow@yahoo.com
        */
		
		Task1 obj = new Task1();
		String email=obj.createEmail("Mahri", "Ashyrova", "gmail");
		System.out.println(email);
		
		 email=obj.createEmail("Bob", "Snow", "outlook");
		
		 
		
	}
	
	String createEmail(String userName, String lastName, String emailType) {
		
		 String email=userName+lastName+"@"+emailType+"com";
		 return email.toLowerCase();
	}
	
	
	
	
	

}
