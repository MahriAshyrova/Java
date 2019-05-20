package com.InterviewReview;

public class SwapNumbersStrings {

	public static void main(String[] args) {
		
		int[] array= {1000,200,222,11}; 
		
		
		int largest=array[0];
		int secondLargest=0;
		
		for(int i=0; i<array.length; i++) { 
			
		if (array[i]>largest) {
			
		secondLargest=largest;
		
		largest=array[i];
		
		}else if (array[i]>secondLargest && array[i]!=largest){
			
		secondLargest=array[i]; 
		
		}
			
	}	
	
		System.out.println("The largest number="+largest+" second Largest="+secondLargest);
	}
}
