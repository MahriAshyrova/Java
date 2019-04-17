package com.class24;

public class Task2 {
	
	public static void overload() {
		System.out.println("I am a no parameter method");
	}
	public static void overload(String a) {
		System.out.println("I am a method with 1 String parameter");
	}
	public static void overload(int b) {
		System.out.println("I am a method with 1 int parameter");
}
	

	public static void main(String[] args) {
		
		// Create 1 class with a static method that has 3 overloaded forms.
		// Then call each overloaded method with specific arguments and observe result.

		overload();
		overload("Hello");
		overload(5);
		
		
		
		
	}

}
