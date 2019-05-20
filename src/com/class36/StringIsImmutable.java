package com.class36;

public class StringIsImmutable {

	public static void main(String[] args) {
		
		
		// 2 ways to create a String object:
		
		
		// a 1 way - using String literal
		String str= "Hello";
		
		// 2 way using new keyword
		String str2= new String("Bye");
		str=str.toUpperCase();
		str=str.replaceAll("O", "a");
		
		System.out.println(str);
	}	
	}

