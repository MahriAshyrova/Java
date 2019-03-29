package com.ReviewSession;

public class ArrayTask2 {

	public static void main(String[] args) {
		/*
        * Write a program to test if an array contains a specific value.
        * Hint: use a boolean flag
        */
		
		
		 boolean found=true;
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int a=1; a<=array.length; a++) {
			if (a==6) {
				found=true;
				break;
			}	
				
			}
			if (found==true){
				System.out.println("The array contains the value of 6 ");
			}else {
				System.out.println("The array does not contain the value of 6 ");
			}
			
		}
		
	}


