package com.class15;

public class Car {
	
	String make, model, color;
	int door, wheels; 
	
	
	
 public static void main (String [] args) {
	 
	 //Classname variableName=new ClassName();
	 
	 // 1 Object 
	 Car car1=new Car();
	 car1.make="Honda";
	 car1.model="Civic";
	 car1.color="Black";
	 car1.door=4;
	 car1.wheels=4;
	 //CAR HONDA HAS 2 WHEELS 
	 
	 System.out.println("Car "+car1.make+" has "+car1.wheels+" wheels");
	 // define behaivor 
	 car1.drive();
	 car1.reverse();
	 car1.stop();
	 System.out.println("-------------Second Object-----------");
	 // My car is blue Tesla
	 // 2 Object 
	Car car2=new Car(); 
	car2.make="Tesla";
	car2.model="X";
	car2.color="Blue";
	car2.door=4;
	car2.wheels=4;
	System.out.println("My car is "+car2.color+" "+car2.make);	 
	car2.drive();
	car2.reverse();
	car2.stop();
	 
	
 }
	
 	void drive()  {	
	System.out.println("Car can drive");
 	}
	void reverse() {
		System.out.println("Car can reverse");
	}
	
	void stop() {
		System.out.println("Car can stop");
	}
	
	
	

}
