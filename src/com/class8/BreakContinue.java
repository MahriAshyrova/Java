package com.class8;

public class BreakContinue {

	public static void main(String[] args) {
		// break and continue with loops

	for (int i=1; i<=10; i++) {
		if (i==5) {
			break;
		}
		System.out.println(i);
	}
	
	System.out.println();
		
	for (int g=0; g<=4; g++) {
		System.out.println("hello");
		break;
	}
	
	System.out.println();
	
	for (int i=0; i<=10; i++) {
		if (i==2 || i==3) {
		continue;	
		}
	System.out.println(i);
	System.out.println("Hi");
	}
	
	System.out.println("I am outside of for loops");
	
		
	}

}
