package SelfPractive;

import java.util.Scanner;

public class ForLoopsFibonacciSeries {

	public static void main(String[] args) {
		/*The fibonacci sequence is a sequence of numbers in which the next number is the sum of the previous two numbers.

		 *The first two numbers of the fibonacci sequence are 0, 1.

		 *The first 8 numbers of the fibonacci sequence are 0, 1, 1, 2, 3, 5, 8, 13

		 *Write some code to print out the first X numbers of the fibonacci sequence.

		 *Your output should be on one line, with each number separated by a space.  You may assume that x is at least 2.
		 */ 

		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	   	//write your code below
	   int a=0, b=0, c=1; 
	   	
	   	
	   	for (int y=1; y<=x; y++) {
	   	  a=b;
	   	  b=c;
	   	  c=a+b;
	   	  
	   	    System.out.print(a+" ");
	   	  
	   	    
	   	  
	   	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
