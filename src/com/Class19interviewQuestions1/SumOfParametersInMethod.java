package com.Class19interviewQuestions1;

public class SumOfParametersInMethod {

	public static void main(String[] args) {
		
		// Prepare a method taking an integer a  as  parameter and returns the sum of of digits of a. For instance, your number is 38 and the sum will be 3+8=11
		
		getSum (38);
		System.out.println(getSum (38));
		
		
	}

		static int getSum (int num)  {
			
			int sum = 0; 
	          
	        while (num != 0) 
	        { 
	            sum = sum + num % 10; 
	            num = num/10; 
	        } 
			
	        return sum;
			
		}	

	}


