package SelfPractive;

import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
    	Write a for loop that will print out the numbers starting at 1 and ending at the input inclusive. 
     	The numbers printed should all be on the same line separated by a space.
		 */
		
		
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int end = inp.nextInt();
	    //write your code below
	   
	    
	    for (int a=1; a<=end; a++) {
	      System.out.print(a+" "); 
	    }
	    	
		
		
		
		
	}

}
