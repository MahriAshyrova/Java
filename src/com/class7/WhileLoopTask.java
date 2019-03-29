package com.class7;

public class WhileLoopTask {

	public static void main(String[] args) {
		/* print only odd numbers from 1-10
		 */

	int num=1;
	
	while (num<=20) {
		//System.out.println("I am inside while loop");
		if (num % 2 != 0) {
		System.out.println(num);
		}
		 num++;
	}
	System.out.println();
	//print only even numbers from 10 -100

	int a=10;
	
	while (a<=100) {
		if (a%2==0) {
			System.out.println(a);
		}
		a++;
	}
	
	
	
	
	
	
	
		
	}

}
