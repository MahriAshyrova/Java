package SelfPractive;

import java.util.Scanner;

public class ForLoopTwiceExersice {

	public static void main(String[] args) {
		// Write a for loop that will print out the numbers starting at 1 and ending at twice the end number exclusive. 
		// Each number should be on the same line, separated by a space. 

		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    int end = inp.nextInt();
	    //write your code below
	    for (int a=0; a<end*2; a++) {
	      System.out.print(a+" ");
	    }
	}

}
