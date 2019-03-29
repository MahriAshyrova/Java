package com.ReviewSession;

import java.util.Scanner;

public class ArrayTask5 {

	public static void main(String[] args) {
		// Write a program to reverse an array of integer values

		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 5 integers");
		int[] arr = new int[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextInt();
		}
		
		for(int i=arr.length-1; i>=0; i--){
			System.out.println("The reverse order of your integers are "+arr[i]);
			 }
		
		
	}

}
