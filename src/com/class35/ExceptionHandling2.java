package com.class35;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		System.out.println("Beginning the code");
		int a=10;
		int b=10;
		
		try {
			
		System.out.println(a/b);
		System.out.println("The code inside the try block");
		
		
		} catch (ArithmeticException e) {
			
			System.out.println("The code inside a catch block");
		}
		System.out.println("The end of the program");
		
		
	}

}
