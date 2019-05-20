package com.class25;

public class FinalKeyword {
	
	public static final String name="SYNTAX";

	public static void main(String[] args) {
	
		/*
		 * Final keyword can be used in three places/ways
		 * 1. Final variables - we cannot change their value ---> CONSTANT VARIABLE
		 * 2. Final methods - we CANNOT OVERRIDE THE FINAL METHOD 
		 * 3. Final classes - we CANNOT create a child of a class ---> PREVENT INHERITANCE 
		 */
		
		final String str="Hello";
		// str="John";
		// name="School";	
		
	}
	
	public final void hello() {
		System.out.println("Hello form a parent class");
	}	

}

class ChildOfFinal extends FinalKeyword{
	
	
	// ERROR, CANNOT OVERRIDE THE FINAL METHOD 
//	public final void hello() {
//		System.out.println("Hello form a parent class");
//	}
//		
	
}



