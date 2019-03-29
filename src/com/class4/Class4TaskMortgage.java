package com.class4;

public class Class4TaskMortgage {
	public static void main(String[] args) {
		
	/*create mortgage rate and mortgage price
	 * if rate is < than 4.5 -->  user will  buy a house, else, user will not buy 
	 * 	if price of the house is < than 200000--> user will pay cash, otherwise, he will take a loan
	 */
		
	
	
	   System.out.println("\n");
		
	   double mortgageRate1 = 4.4;
		int mortgagePrice1 = 30000; 
		
		if (mortgageRate1 <4.5) {
			System.out.println("I will consider buying a house");
			if (mortgagePrice1 <200000) {
			System.out.println("I am paying cash ");
		}else {
			System.out.println("I will take a loan");
		}
			
		    }else {
			System.out.println("I will not buy that house");
		   
		      }   		
		
	}

}
