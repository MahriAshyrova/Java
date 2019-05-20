package com.class28;

public abstract class Vehicle {
	
	static int vehicleCount;
	
	Vehicle(){
		vehicleCount++;	
	}
	
	// public abstract void gps(); - cannot have static abstract methods - cannot be overriden 
	// private abstract void speed(); - cannot have private methods - don't participate in inheritance
	// public abstract final void break(); - cannot have final abstract methods - cannot be overridden 
	protected abstract void start();
	public abstract void drive();
	public void stop() {
		System.out.println("Stop a vehicle by pressing the break");
	}
	
	public static void displayTotalVehicles() {
		System.out.println("Total count of vehicles we created "+vehicleCount);
	}
	
	
}

abstract class Car extends Vehicle {
	//by default compiler will create a constructor inside the child constructor when we class a parent constructor 
	/* Car(){
	 * super(); // added by default 
	 * }
	 */

	public String make;
	// we cannot create an object of an absract class 
	// but since we have instance variables inside the class we need someone to initiale them --> performed by constructor
	
	Car(String make){ // instance variables are allowed in the abstract class
		this.make=make;
	}
}
 class BMW extends Car {
	 
	//by default compiler will create a constructor inside the child constructor we class a parent constructor 
		/* 
		 * BMW(){
		 * super();  // added by default 
		 * }
		 */

	 BMW(String make) {
		 super(make);
	 }
	 
	@Override
	public void start() {
		System.out.println("BMW car starts remote");
		
	}

	@Override
	public void drive() {
		System.out.println("BMW car drives fast");	
	}
}
 class Toyota extends Car{

	Toyota(String make) {
		super(make);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Toyotas start with push button");
		
	}

	@Override
	public void drive() {
		System.out.println("Toyotas car drives safe");
	
	}
	 
 }