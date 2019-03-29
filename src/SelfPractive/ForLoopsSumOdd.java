package SelfPractive;

import java.util.Scanner;

public class ForLoopsSumOdd {

	public static void main(String[] args) {
		// You are to write a program that will calculate and print out the SUM OF ODD numbers in between num1 and num2 inclusive. 
		// Your output should all be on one line, separated by spaces.
		//Sample input/output:
		//	#1: 3
		//	#2: 11
		//	35

	
		Scanner s = new Scanner(System.in);
	    System.out.print("#1: ");
	    int num1 = s.nextInt();
	    System.out.print("#2: ");
	    int num2 = s.nextInt();
	    //start on line 11
	    int sumOdd=0;
	    int sumEven=0;
	    
	    for (int a=num1; a<=num2; a++) {
	    	if(a%2!=0) {
	    //System.out.println(a);
	    sumOdd+=a;
	    	}else if (a%2==0) {
	    		sumEven+=a;	
	    	}
	  } 
	  System.out.println(sumOdd);
	  System.out.println(sumEven);
	}

}
