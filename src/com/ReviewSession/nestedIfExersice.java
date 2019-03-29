package com.ReviewSession;

public class nestedIfExersice {

	public static void main(String[] args) {
		/*
		 * check if user has a credit card
		 * check what the balance is, if balance if >1000-->pay off now
		 * else you are good
		 */

	boolean creditCard=true;
	int balance = 900;	
		
	if (creditCard) {
		System.out.println("Let's check the balance");
		if(balance>=100) {
			System.out.println("pay off now");	
			}else {
				
			System.out.println("you are good");
			}
		} else {
			System.out.println("Do you want a creadit card?");
		}
		
	}	
	}


