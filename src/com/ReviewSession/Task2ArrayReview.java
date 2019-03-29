package com.ReviewSession;

public class Task2ArrayReview {

	public static void main(String[] args) {
		// Write a program to find the average of row 2.
//      2 6 9 3 7
//      1 7 9 4 8
//      0 4 6 2 5
//      0 1 2 3
		
		
int[][] rating = { { 2, 6, 9, 3, 7 }, { 1, 7, 9, 4, 8 }, { 0, 4, 6, 2, 5 }, { 0, 1, 2, 3 } };
   
	int sum=0; 
	//int aver; -avoid more coding if you can

	for (int i=0; i<rating[1].length; i++) {
		sum=sum+rating[1][i];	
	}
	//aver=sum/5;
	//System.out.println(aver);
	System.out.println(sum/5);
		
		
	}

}
