package com.class8;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		for (int i=1; i<=5; i++)	{
		sum=sum+i;
	}
		
	System.out.println(sum);	
	System.out.println();
	
	//i am sum of all even numbers from 1-100
	
	int sum1=0;
	
	for (int a=2; a<=100; a+=2) {
		sum1=sum1+a;
		}
	System.out.println(sum1);
	
	
	System.out.println();
	
	int sumAll=0;
	for (int y=10; y<=50; y+=10) {
		
		sumAll=sumAll+y;
	}
	
	System.out.println(sumAll);
	
	
	
	}

}
