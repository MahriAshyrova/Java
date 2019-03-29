package com.ReviewSession;

public class ArraysReviewTask1 {

	public static void main(String[] args) {
		// * Write a program to sum the values of an array 1-10
		
		
		int sumArray=0;
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int a=1; a<=array.length; a++) {
			sumArray=sumArray+a;
		
		}
		
		System.out.println("The sum of array elements is "+sumArray);
		
	}

}
