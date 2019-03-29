package com.class11;

public class Task3 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array.
		
		int[] a = {1,2,3,4,5};
		int sum=0;
		for (int i=1; i<=a.length; i++) {
		 sum=sum+i;
		 
		}
		System.out.println("The sum is equal to "+sum);
		
		System.out.println("------------------------");
		
		
		
		int[] numbers = {1,2,3,4,5};
		int sum1=0;
		for(int total :numbers) {	
		sum1+=total;
			
		}
		System.out.println(sum1+" ");
	}

}
