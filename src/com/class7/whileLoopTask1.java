package com.class7;

public class whileLoopTask1 {

	public static void main(String[] args) {
		/* create a boolean variable workDay and assign true
		 * create int variable and assign it to 1
		 * as long as it is a workDay print--> "I need a day off" and increment day
		 * day once is day is 6 --> your condition for your loop should become false
		 */
		
		
		boolean workDay=true;
		
		int day=1;
		
		while (workDay) {
			
			System.out.println("I need a day off");	
		    if (day>=6) {
			System.out.println("I don't need a day off");
			workDay=false;	
			}
		    day++;	
		}	
	}

}
