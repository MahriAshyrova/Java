package com.InterviewReview;

public class ReverseAStringReverseAStringWordByWords {

	//  Write a java program to reverse String? Reverse a string word by word?
	
	public static void main(String[] args) {
		

	String s="Hello World";
	String reversed="";
	
	String [] words=s.split(" ");
	
	for (int i=words.length-1; i>=0; i--) {
		reversed=reversed+words[i]+" ";
	}
	System.out.println(reversed);
	
	
	StringBuffer sb = new StringBuffer(s);
	System.out.println(sb.reverse());
	
	String str="I am learning Java";
	
	String reverse="";
	
	for (int i=str.length()-1; i>=0; i--) {
		reverse=reverse+str.charAt(i);
	}
	
	System.out.println(reverse);
	
	
	}

}
