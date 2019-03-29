package SelfPractive;

import java.util.Scanner;

public class ForLoopsDescending {

	public static void main(String[] args) {
		// Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.

		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int x = inp.nextInt();
	    //write your code below
	    
	    for (int a=x-1; a>=0; a--) {
	      System.out.println(a);
	      
	    }
	    
	}

}
