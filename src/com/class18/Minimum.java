package com.class18;

public class Minimum {
	
	/*Create a class Called Minimum with in it crate two methods called minOfValues, MaxOfValues and make them static

	// From your previous Applicaions class call the method and pass an array argument and print out the result
	
	// int my_array[] = {-1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	 */
	
	 
	static int minOfValues(int[] x)	 {
	
		int min=x[0];
		
		for (int y:x) {
			if (y<min) {
				 min =y;
			}
		}
		return min;	
}
	static int MaxOfValues(int[] y) {
		int max=y[0];
		
		for(int w:y) {
			if (w>max) {
				max=w;
			}
		}
		return max;
	}
	void print () {
		
		
		int my_array[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.println("Printing the minimum");
		
		System.out.println(minOfValues(my_array));
		System.out.println(MaxOfValues(my_array));
		
	}
	
}
