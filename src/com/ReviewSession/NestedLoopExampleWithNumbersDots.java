package com.ReviewSession;

public class NestedLoopExampleWithNumbersDots {

	public static void main(String[] args) {
		/* Write a program that prints the following pattern
        *
	....1
	...2
	..3
	.4
	5
*/
		
		
	for (int a=1; a<=5; a++)	 {
		for (int b=1; b<=(5-a); b++) {
			System.out.print(".");
		}
		System.out.println(a);
		
	}	
	}

}
