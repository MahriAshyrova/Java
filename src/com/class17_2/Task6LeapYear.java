package com.class17_2;

import java.util.Scanner;

public class Task6LeapYear {

	public static void main(String[] args) {
		//Ask a user to input a leap year. Give the user 10 chances to enter a correct leap year.
		//As soon as the user enters the correct leap year exit the loop.
		
		//if year is divisible by 400--> leap year
        //if year is divisible by 100--> not a leap year
        //if year is divisible by 4--> a leap year
        //(year%400 == 0)|| (( year%4 == 0 ) &&( year%100 != 0)--> same thing
        				
        int year;
        
        Scanner scan=new Scanner(System.in);
        
        for (int i=0; i<10; i++) {
            
            System.out.println("Please enter to guess a leap year!");
            year=scan.nextInt();
            
            
            if (year%400==0) {
                System.out.println("Year is a leap year");
                break;
            }else if (year%4==0 && year%100!=0) {
                System.out.println("Year is a leap year");
                break;
            }else {
                System.out.println("Year is a NOT leap year");
            }
            
        }
    }

		
		
	}


