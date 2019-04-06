package com.class17_2;

public class NestedLoopPatternTask {

	public static void main(String[] args) {
		// I want to print a pattern
		//***** - 4 row, 5 columns
		//*****
		//*****
		//*****
		
		NestedLoopPatternTask pattern= new NestedLoopPatternTask();
		pattern.printPattern();
		
			
	
	}
	void printPattern() {
		for (int a =0; a<4; a++) {
			
			for (int b=0; b<5; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
