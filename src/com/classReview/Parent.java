package com.classReview;

public class Parent {
	
	int a;
	String str; 
	double c;
	
	Parent() {
		int a=10;
		String str="Hello"; 
		double c=0.5;
		System.out.println(a+" "+str+" "+c);
	}
	
	public static void main(String [] args) {
		Parent obj= new Parent();
		
	}
	
	
}
