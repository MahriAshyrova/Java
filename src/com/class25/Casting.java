package com.class25;

public class Casting {
	
	
	public static void main(String [] args) {
		
		// Implicit /Automatic casting /Widening ----> compiler takes care of conversion 
		double a=10;
		System.out.println(a);
	
		//Explicit /Manual/Narrowing -----> a programmer takes care of conversion 
		double b=10.0;
		int c=(int)b;
		
		System.out.println(c);
		
		int i=130;
		// byte by=130; ----> compiler won't allow 
		
		byte by=(byte)i;
		System.out.println(by);
		
		// UpCasting --->compiler takes care of conversion
		Payment pay=new MasterCard();
		
		// MasterCard mc=new Payment();  ----> compiler won't allow 
		
		// downCasting 
		MasterCard mc=(MasterCard)new Payment();
		
		
		
		
	}
	

}
