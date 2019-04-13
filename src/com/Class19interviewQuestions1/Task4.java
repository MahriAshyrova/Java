package com.Class19interviewQuestions1;

public class Task4 {

	public static void main(String[] args) {
		
		// How to find out the part of the string from a string? What is substring? Find number of words or array of Strings in string?
	
		
	String str="Liliacs are violet!"	;
	System.out.println(str.substring(0, str.length()/2));
	System.out.println(str.substring(11));
		
		
	String str1="My favorite flowers are lilac";
	
	String [] wordCount=str1.split(" ");
	System.out.println(wordCount.length);
	
	
	}
		

	}


