package com.class36;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		int a=10;
		int b =0; 
		
		//checkAgeEligibility(17);
		//twoNumDiv(10, 0);
		checkUserNameLength("A");
		
	//	System.out.println(a/b); // JVM got created new ArithmeticException() implicitly; 
		
		
	// if person is more that 18 ---> him him driver license else ----> throw an exeption 	
	} public static void checkAgeEligibility(int age) {
		
		if( age>=18) {
			System.out.println("Congratulations on your driver license!");
		}else {
			throw new ArithmeticException("You are not eligible to get a driver license");
		
		}
	}
	
	public static void twoNumDiv(int a, int b) {
		
		if (b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("We cannot devide by zero!");
		}
	}
	public static void checkUserNameLength(String userName) {
	
		if(userName.length()>3) {
			System.out.println("User name is accepted");
		} else {
			throw new NullPointerException("User name must be longer than 3 characters");
			
		}
		
	}
	
	

}
