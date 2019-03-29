package SelfPractive;

import java.util.Scanner;

public class ArraysWeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array = {"Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday"};

		Scanner input = new Scanner(System.in);

		  for (int i = 1; i<=7; i++){
			  
			  System.out.println("Please enter day "+i+" of the week");
			  String day = input.nextLine();
			  //System.out.println(array[i]);    	 			  
			  
	}
		  System.out.println(array[0]);	  	  
		  System.out.println(array[1]);	  
		  System.out.println(array[2]);	  
		  System.out.println(array[3]);	  
		  System.out.println(array[4]);	  
		  System.out.println(array[5]);	  
		  System.out.println(array[6]);	  
		 
	}
}
