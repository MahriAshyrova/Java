package com.class9;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
// Ask user to enter the item they want to buy and the price for the item. 
// Then ask user to pay for it. Every time user enters money accumulate the amount and tell user how much is left to pay off the amount. 
// Whenever user done with payments tell them "Thank you for shopping!"

//     int sum=0, change, lessPayment, userPayment;  	
//	 	
//		
//		Scanner input =new Scanner (System.in);
//		System.out.println("Please enter the item you want to buy");
//		String item=input.nextLine();
//		System.out.print("What is the price of the item");
//		int itemPrice=input.nextInt();
//        		
//			do {
//				System.out.println("Please make a payment");
//				userPayment=input.nextInt();
//				sum=sum+userPayment; 
//				if (sum<itemPrice) {
//					lessPayment=itemPrice-sum;
//					System.out.println("You need to pay $"+lessPayment+" more for your "+item);				
//		} 
//			}while(sum<itemPrice); {
//			if (sum>itemPrice) {
//		    	change=sum-itemPrice;
//				System.out.println("Your change is " +change+ "! Thank you for shopping!");   		
//				}else {
//			    	System.out.println("Thank you for shopping!");
//				}
//		}				
		double totalPayment=0, balance, payment, change;
		
		Scanner input =new Scanner (System.in);
		System.out.println("Please enter the item you want to buy");
		String item=input.nextLine();
		System.out.print("What is the price of the item");
		double price=input.nextDouble();
	
		do {
			System.out.println("Please enter your payment amount");
			payment=input.nextDouble();
			
			totalPayment=totalPayment+payment;
			
			balance=price-totalPayment; 
			
			if (totalPayment>price) {change=totalPayment-price;
			System.out.println("Please take your change "+change);
			break;
				
			}else if (totalPayment<price){
				balance=price-totalPayment;
				System.out.println("Please enter more $" +balance);
			}
			
		}while (totalPayment!=price);
				
		System.out.println("Thank you for shopping!");
		
		}	
		
		
	}
	


	
	