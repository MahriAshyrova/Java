package com.class16;

public class Task2 {

	public static void main(String[] args) {
		
		// Create a method that will take a number and prints whether the number is even or odd.

		Task2 obj=new Task2();
		obj.oddOrEven(5);	
		
	}
	
	void oddOrEven(int a) {
		
		if (a%2==0) {
			System.out.println(a+" is even");
		}else {
			System.out.println(a+" is an odd");
		}
	}

}
