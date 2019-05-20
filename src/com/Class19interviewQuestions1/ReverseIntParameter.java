package com.Class19interviewQuestions1;

public class ReverseIntParameter {

	public static void main(String[] args) {
		
		 ReverseIntParameter obj = new  ReverseIntParameter();
		 obj.reverseInteger(1234);
		
		// Write a method taking an integer x as  parameter and
		// returns the reverse of the number.  For instance  your number is 8245 output is 5428.
	}
	
	
	public int reverseInteger(int a){
		
		int reversed=0;
		
		while(a!=0) {
			
			int digit = a%10;
			reversed= reversed*10+digit;
			a/=10;
		}
		System.out.println("Reversed number: "+reversed);
		return reversed;
		
	}
}
