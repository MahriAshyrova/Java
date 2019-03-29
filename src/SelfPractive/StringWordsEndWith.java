package SelfPractive;

import java.util.Scanner;

public class StringWordsEndWith {

	public static void main(String[] args) {
		/* 
	Given a string variable "word", do the following tests
	If the word ends in "y", print "-ies"
	If the word ends in "ey", print "-eys"
	If the word ends in "ife", print "-ives"
	If none of the above is true, print "-s"
	No more than one should be printed.
		 */
		
		
		
		
		
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String word = inp.nextLine();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  if (word.endsWith("y")) {
	    	System.out.print("ies");
	  }	else if (word.endsWith("ey")) {
	    	System.out.print("eys");
	  }	else if (word.endsWith("ife")) {
	    	System.out.print("ives");
	  }	else {
	    System.out.print("s");	
	  	
	  }	
	
		
	}

}
