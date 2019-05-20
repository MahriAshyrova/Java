package com.InterviewReview;

public class WhatIsAStringFindNumberOfWords {

	// How to find out the part of the string from a string? What is substring? Find number of words in string?
	
	public static void main(String[] args) {
		
		String a="Welcome to the interview sessions with Syntax";
		
		System.out.println(a.substring(39));
		
		System.out.println("-----------------");
		
		String [] words= a.split(" ");
		
		System.out.println(words.length);
		
		System.out.println("-----------------");

		
		for (String string : words) { 
			System.out.println(string);
		}
		
	}

}
