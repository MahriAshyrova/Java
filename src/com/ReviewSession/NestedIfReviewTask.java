package com.ReviewSession;

import java.util.Scanner;

public class NestedIfReviewTask {

	public static void main(String[] args) {
		/* ask user to  enter price and boolean value or sale 
		 * based on the sale, we will check the price
		 * if price is <20 apply 20%  discount and find final price 
		 * if price is >20 less 100 --> apply 30%  discount and find final price 
		 * if price is >100 less 500 --> apply 50%  discount and find final price 
		 */
		
	boolean sale=true;
	double price, discount, finalPrice;
	
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter the price");
	price=scan.nextDouble();
	
	
	if (sale) {
		if (price >0 && price<=20 ){
			discount=20;	
			finalPrice=price-(price*0.2);
		
	}else if (price >20 && price<=100 ){
		    discount=30;	
		    finalPrice=price-(price*0.3);
	} else if (price >100 && price<=500 ){
		discount=50;	
		finalPrice=price-(price*0.5);
	}else 
		discount=75;
		finalPrice=price-(price*0.75);
		System.out.println("Your final price is " +finalPrice);	
		
	}else {
		
		System.out.println("Please enter different price");
	}	
	}

	}
