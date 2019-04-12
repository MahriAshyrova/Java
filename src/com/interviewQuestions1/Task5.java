package com.interviewQuestions1;

public class Task5 {

	public static void main(String[] args) {
		
 // Write a java program to reverse String? Reverse a string word by word?
		
			
		
			
			String str="My favorite flowers are lilac";
			String reverse="";
			
			for (int i=str.length()-1; i>=0; i--) {
				reverse=reverse+str.charAt(i);
			}
			
			
			
			String [] words=reverse.split(" ");
			for(int i=words.length-1; i>=0; i--) {
				System.out.print(words[i]+" ");
			}
		
			System.out.println();
			System.out.println();
			
		
	}
	
}
