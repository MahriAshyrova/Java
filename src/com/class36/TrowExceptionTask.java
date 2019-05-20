package com.class36;

public class TrowExceptionTask {
	// create an exception: when user is trying to withdraw larger amount than available in the balance, throw 
	// an exception saying "You do not have enouth money!"
	
	public static void main(String[] args) {
		
		checkBalance(1000, 1200);	
	
	}
	 public static void checkBalance(double balance, double amount) {
		 
		if (amount<=balance) {
			System.out.println("Enjoy your money!");
		}else {
			throw new ArithmeticException("You do not have enouth money!");
		}
		 
		 
		 
	 }
	

}
