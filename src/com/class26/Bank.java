package com.class26;

class Bank {
	
	//A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively. 
		//We have to print the money deposited by him in a particular bank. 
		//Create a class ‘Bank’ with a method ‘getBalance’ which returns 0.
		//Make three subclasses named ‘BankA’, ‘BankB’ and ‘BankC’ with a method with the same name ‘getBalance’ 
		//which returns the amount deposited in that particular bank. 
		//Call the method ‘getBalance’ by the object of each of the three banks.

	
	
	
public int getBalance() {
		
		return 0;
	}	
}
		
class BankA extends Bank {
	
	public int getBalance() {
		
		System.out.println("Your deposit is in BankA "+1000);
		return 1000;
	}		
}

class BankB extends Bank {
	
	public int getBalance() {
		
		System.out.println("Your deposit is in BankB "+1500);
		return 1500;
	}	
}

class BankC extends Bank {
	
	public int getBalance() {
		
		System.out.println("Your deposit is in BankC "+2000);
		return 2000;
	}	
	
}

