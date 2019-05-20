package com.class28;

public interface Bank {
	

	
	static String name="Bank"; // by default all variables inside the interface are public static final 
	String hello="hi"; // by default it will be public static final 
	
	// by compiler adds public and abstract to every method
	void hasCheking();
	void hasSavings();
	void hasCreditCard();
	
	// static void hasLoan(); -cannot have static abstract methods 
	
}
class BOA implements Bank{

	@Override
	public void hasCheking() {
		System.out.println("BOA has two checking accounts");
	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has two svaings accounts");
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 different cc");
	}
}
class PNC implements Bank {

	@Override
	public void hasCheking() {
		System.out.println("PNC has 3 checking accounts");	
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 svaings accounts");	
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 different cc");
	}
	
	public void hasLoan() {
		System.out.println("PNC has loans");
	}
}
