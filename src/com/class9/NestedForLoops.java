package com.class9;

public class NestedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//for(initialization; condition; increment/decrement)	{
		//code A;
		
		//for (initialization, condotion, increment/decrement) {	
		//code B; 
		//}
	    //}
		
	for (int i=0; i<5; i++) {
		System.out.println("-----I am an outer loop----");
		
			for (int y=0; y<3; y++) {
			System.out.println("I am an inner loop");
		}
		
	}	
	
	System.out.println();
	
	for (int i=0; i<3; i++) {
		
			for (int y=0; y<3; y++) {
			System.out.println("I am an inner loop "+y);
		}
		System.out.println("-----I am an outer loop----" +i);
	}	
	
	
	
	
	
	
		
//0-outer loop
	//0-inner loop
	//1-inner loop
	//2-inner loop
//1-outer loop
	//0-inner loop
	//1-inner loop
	//2-inner loop
//2-outer loop
	//0-inner loop
	//1-inner loop
	//2-inner loop
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}

}
