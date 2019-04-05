package com.class16;

public class Task3 {

	public static void main(String[] args) {
		
		// Create a method that will print whether given String is palindrome or not.

		Task3 obj=new Task3();
		obj.palidrone("Bob"); //argument
		
		
		
	}
	// void is a return type, palidrone - method name
	void palidrone(String word) { // parameter 
		
		String reverse="";
		for (int i=word.length()-1; i>=0; i--) {
			reverse+=word.charAt(i);
		}
		if(word.equalsIgnoreCase(reverse)) {
			System.out.println("The reverse word is "+reverse+", "+word+" is a palidrome");
		}else {
			System.out.println("The reverse word is "+reverse+", "+word+" is not a palidrome");
		}
	}

}
