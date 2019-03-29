package com.class5;

import java.util.Scanner;

public class Class5Task4 {

	public static void main(String[] args) {
		/* ask user to  enter price and boolean value or sale 
		 * based on the sale, we will check the price
		 * if price is <20 apply 20%  discount and five final price 
		 * if price is >20 less 100 --> apply 30%  discount and five final price 
		 * if price is >100 less 500 --> apply 50%  discount and five final price 
		 */

		
		Scanner scan;
		boolean sale=true;
		int discount;
		int price;
		double finalPrice;
		
	scan = new Scanner(System.in);	
	System.out.println("Please enter if there is any sales");	
	sale=scan.nextBoolean();
	
	
	if (sale) {
		System.out.println("Please enter the price of the item");
		price=scan.nextInt();
		
		System.out.println("Lets check all discounts");		
	if (price<20) {
		discount=20;
		finalPrice=price-(price*0.2);
	}else if (price>=20 && price<100) {
			discount=30;
			finalPrice=price-(price*0.3);	
	}else if (price>=100 && price<500) {
		discount=50;
		finalPrice=price-(price*0.5);	
	}else 
		discount=75;
		finalPrice=price-(price*0.75);	
		
	System.out.println("The final price is " +finalPrice);		
	
	}else {
		System.out.println("Not interested");	
	}
	
	}		
	}	