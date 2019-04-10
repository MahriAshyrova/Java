package com.class20;

public class Task2 {

	public static void main(String[] args) {
		
		
		
		Task2 reverse=new Task2();
		String newString =reverse.reverseString("I like liliacs");
		System.out.println(newString);

	}
	
	protected String reverseString(String str) {
	
		String reverse="";

		for (int i=str.length()-1; i>=0; i--) {
			reverse=reverse+str.charAt(i);
		}
		return reverse;
	}
		
}
