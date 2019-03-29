package com.class11;

public class Task4LargestArray {

	public static void main(String[] args) {
		// Create an array of integers and print the largest

		int[] numbers = {200, 20, 13, 499, 65};
		int largest =numbers [0];
		
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]>largest) {
				largest=numbers[i];	
			}
			
		}
	System.out.println("The largest number is "+largest);	
	
	System.out.println("------------------");
	
	int[] numbers1 = {200, 20, 13, 499, 65};
	int largest1 =numbers1 [0];
	for (int num:numbers) {
		if(num>largest1) {
			System.out.println(num);
		}
	}
	
	}

}
