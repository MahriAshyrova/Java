package com.class25;

public class PaymentTest {

	public static void main(String[] args) {
		
		Payment parent = new Payment();
		parent.makePayment();
		
		MasterCard mc = new MasterCard();
		mc.makePayment();
		
		Visa visa = new Visa();
		visa.makePayment();
		visa.annualFee();
		
		// achieving run time polymorphism 
		// pay -reference variable, payment- type
		// new MasterCard(); - creating an Object 
		Payment pay=new MasterCard();
		// any methods that exist in parent and common in child 
		pay.closePayment();
		pay.makePayment(); // at the run time JVM will always execute the overriding class (from the coomon class)
		
		//Upcasting and achieving run time polymorphism 
		Payment pay1=new Visa(); // when an object of the child class is created and given refernce to a parent/super class 
		pay1.closePayment();
		pay1.makePayment();
		pay1.closePayment();
		// pay1.annualFee(); - method undefined 
		
		
		
		
		
		
	}

}
