package com.class5;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * if number is between 1-10 --> small
		 * if number is between 11-100 --> medium
		 * if number is between 101-1000 --> large
		 */
     
		int num = 15;
		
		//True AND False = False
		if (num>=1 && num<=10) {
			System.out.println("number is small");
			
			//True AND True = True
		}else if (num>=11 && num<=100){
			System.out.println("number is medium");
			
			//False AND True = False
	    }else if (num>=101 && num<=1000){
			System.out.println("number is large");
			
	}	else {
		System.out.println("Number is not in our range");
	}
		
	}

}


