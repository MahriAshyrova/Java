package com.ReviewSession;

public class NestedLoopPatternHome {

	public static void main(String[] args) {
		/**
	        * Write a program to produce the following pattern
	        *
	....1
	...2.
	..3..
	.4...
	5....   
	        */
		
		for (int a=1; a<=5; a++) {
			for (int b=5; b>=1; b--) {
				
				
			if 	(b==a)	 {
				System.out.print(a);
			}else {
				System.out.print(".");
			}
						
			}
			System.out.println();			
		}
			 
	}

	}

