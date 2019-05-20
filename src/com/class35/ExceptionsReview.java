package com.class35;
/**
*
* Create a new class called ExceptionsReview, in it have the following methods
*
* void arithmetic(int a, int b) method to divide two integers for
* ArithmeticException Arithmetic error, such as divide-by-zero.
*
* void nullPointer() method to be able to throw NullPointerException Invalid
* use of a null reference.
*
* void arrayIndexOutOfBounds() method to be able to throw
* ArrayIndexOutOfBoundsException Array index is out-of-bounds.
*
* void stringIndexOutOfBounds() method to be able to throw
* StringIndexOutOfBoundsException an index is either negative or greater than
* the size of the string.
*
* void negativeArraySizeException() method to be able to throw
* NegativeArraySizeException Array created with a negative size.
*
*
* Create another class called Test and create an object of the ExceptionsReview
* class and
*
* 1. call all the methods you created 2. handle all the exceptions using try
* catch finally blocks 3.
*/
public class ExceptionsReview {
	
	void arithmetic(int a, int b) {
		System.out.println(a/b);
	}
	void nullPointer(String a) {
		
		System.out.println(a.length());
	}
	
	void arrayIndexOutOfBounds() {

	int [] array = new int[5];
	array[6] = 3; 		
	}
	
	void stringIndexOutOfBounds() {
		String str= "Hi students!";
		char chr = str.charAt(17);
	}
	
	void negativeArraySizeException() {
		int [] arr = new int[-5];
	}
	 Throwable throwsMethod() throws Exception {
	        System.out.println("Exception");
	        throw new Exception();
	    }

}
