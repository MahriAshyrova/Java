package com.Class19interviewQuestions1;

public class Task3 {

	public static void main(String[] args) {
		
		// Find out how many alpha characters present in a string?

		
		String str="<>Spring 2019 is welcome<>";
		String replaced =str.replaceAll("[^A-Za-z]", "");
		
		System.out.println(replaced.length());
	
		
		String str1="Maria";
		System.out.println(str1.length());


	}

}
