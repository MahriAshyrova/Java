package com.class17_2;

public class NestedLoopPractice {

	public static void main(String[] args) {
		
		// I want to print
		//54321 - 4 rows, 4 columns;
		//54321
		//54321
		//54321
		
		NestedLoopPractice prac= new NestedLoopPractice();
		prac.print1();
		prac.print2();
		prac.print3();
		prac.print4();
		
	
	} void print1() {
		for (int a=4; a>0; a--) {
			for (int b=5; b>0; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println();
	}	
		
		// I want to print
				//55555 - 5 rows, 5 columns;
				//44444
				//33333
				//22222
				//11111
	void print2() {
				
				for (int a=5; a>0; a--) {
					for (int b=5; b>0; b--) {
						System.out.print(a);
					}
					System.out.println();
				}	
				System.out.println();
	}	
				// I want to print a pattern
				//* - 4 rows, columns depend on the rows <=number of rows
				//**
				//***
				//****
	void print3() {		
				
			for (int a =0; a<4; a++) {
				
				for (int b=0; b<=a; b++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
	}	
			// I want to print a pattern
			// 5 rows, 6 columns, when column =row 1
			//******
			//*    *
			//*    * 
			//******			
				
			
	void print4() {
			
			for (int a =1; a<=4; a++) {
				
				for (int b=1; b<=6; b++) {
					
					if(a==1|| a==4 || b==1 || b==6) {
					System.out.print("*");
					}else {
					System.out.print(" ");
				}
			}
				System.out.println();
			 
			}					
				
	}	
		

}


