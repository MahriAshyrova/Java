package com.class29;

public class RegistrationTest {
	
	public static void main (String [] args) {
		
		
		Registration obj = new Registration();
		obj.setEmail("Marinas@gmail");
		obj.setUserName("Marinas");
		obj.setPassword("rythfbv");
		
	System.out.println("The email address is "+obj.getEmail()+", the user name is "+obj.getUserName()+", and the password is "+obj.getPassword());
		
		}
		

}
