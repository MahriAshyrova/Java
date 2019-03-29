package com.ReviewSession;

public class Task4PrintElemOfColunm3 {

	public static void main(String[] args) {
		//     Print the average of values in column 3.
		
		
		int sum=0; 
		
		int[][] rating = {  { 2, 6, 9, 3, 7 },
							{ 1, 7, 9, 4, 8 },
							{ 0, 4, 6, 2, 5 },
							{ 0, 1, 2, 3 } };
		
		for (int i=0; i<rating.length; i++) {
			
				sum+=rating[i][2];	
		}	
		System.out.println(sum/rating.length);
		
		
		int sum1=0; 
		
		for (int[] col:rating) {
			sum1=sum1+col[2];
		}
	System.out.println(sum1/4);	
		
	}

}
