package com.ReviewSession;

import java.util.Scanner;

public class HomeworkLogicalOperationsReview {

	public static void main(String[] args) {
		
		/*
	     * Write a program that prints out if it is good weather to go for any activity or not
	     * If the temperature is between 40 degrees and 80 degrees inclusive & no
	     * rain--> we will go for hiking otherwise--> we will not go hiking If
	     * temperature is between 25 and 40 inclusive & snowing -->going snowboarding
	     * otherwise we are not going snowboarding it if temperature is more than 80 &
	     * sunny--> go to the beach otherwise --> not go to the beach
	     */
		
		boolean rain;
		boolean snow;
		boolean sunny;
		int temp;
		String activity="";
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the temperature");
		temp=input.nextInt();
		
		
		
		if(temp>=40 && temp<80) {
			System.out.println("Is it raining?");
			rain=input.nextBoolean();
		if(rain)	{
			activity="watch a movie";
			}else {
			activity="go hiking";
			}
		}else if(temp>=25 && temp<40) {
			System.out.println("Is it snowing?");
			snow=input.nextBoolean();
			if (snow) {
				activity="We will be snow boarding";
			}else {
			activity="Lets code";	
			}
			
		}else if(temp>=80) {
			System.out.println("Is it sunny?");
			sunny=input.nextBoolean();
			if (sunny) {
				activity="We will go to the beach";
			}else {
				activity="We will do more coding";
			}
		}else {
			System.out.println("Please enter the different temperature");	
			activity="unknown";
		
		}
		System.out.println(""+activity);		

	}

}
