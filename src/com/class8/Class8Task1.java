package com.class8;

import java.util.Scanner;

public class Class8Task1 {

	public static void main(String[] args) {
		// let user define a range of numbers to print 
		
		Scanner input=new Scanner(System.in);
		System.out.println("please enter a starting number");
		int startNumber=input.nextInt();
		System.out.println("please enter an ending number");
		int endNumber=input.nextInt();
		
		
		if (startNumber < endNumber) {
		
		
	for (int i=startNumber; i<=endNumber; i++)	{
		System.out.println(i);
	}
		}else {
			System.out.println("I won't run your code");
		}	
			
		
	}

}
