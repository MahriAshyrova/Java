package com.class8;

import java.util.Scanner;

public class ForAndScanner {

	public static void main(String[] args) {
	
		// prompt user to enter two integers and compare them
		//print the largest number at the end
		
	int num1, num2; 
	Scanner input;
	int largest=0;
	
for (int i=1; i<=5; i++) {
	
    input =new Scanner (System.in);
	System.out.println("Please enter two numbers");	
    num1=input.nextInt();
    num2=input.nextInt();
     
    
    if (num1>num2) {
    	largest=num1;
    }else if (num2>num1) {
    	largest=num2;
    }else {
    	System.out.println(num1+ " is equals to "+num2);
    }
   System.out.println(largest+ " is the largest");
    
	}
	
	}

}
