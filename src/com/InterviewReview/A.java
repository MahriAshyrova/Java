package com.InterviewReview;

public class A {
	
	 int i;

	}
	class B extends A {
	int j;
	void display() {
		super.i=j+1;
		System.out.println(j +" "+ i);
		}
	
	}
	
	
//	void display() {	
//		super.i= j +1; //super.i=3;
//		System.out.println(j +" "+ i); //2,1
//		

