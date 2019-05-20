package com.classReview;

public class Parent1 {
	
	Parent1(){
		System.out.println("I am from parent class");
	}
	
	
	
	String reverse(String str) {
		String reversed="";
		
		for (int i = str.length()-1; i>=0; i--) {
			reversed+=str.charAt(i);
		}
		return reversed;
	}
	
	
	String reverse(String a, String b) {
		String mixed="";
		if(a.length()==(b.length())) {
		 for (int i = 0; i < a.length(); i++) {
                 mixed=mixed+a.charAt(i)+b.charAt(i);   
		}
		}else {
			System.out.println("Strings are not the same length");
			}

		return (mixed);
	
	
	
	
	}
}
