package com.class16;

public class Greetings {

	public static void main(String[] args) {
		
		Greetings obj = new Greetings();
		obj.hello();
		// how to find a largest number
		obj.findLargest(20, 10);// calling method findLargest and passing values as 20 and 10
		obj.findLargest(30, 31); // calling method findLargest and passing values as 30 and 31
		obj.findLargest(2000, 31543); // calling method findLargest and passing values as 2000 and 31543
		obj.helloToInstructor("Awet");
		obj.helloToInstructor("Arif");
		
		
	}
	
	void helloToInstructor(String name) { //name="Awet" // method with 1 parameter 
		System.out.println("Hello, "+name+"!");
	}
	
	void findLargest(int a, int b) { //method with 2 parameters 
		
		if (a>b) {
			System.out.println("A is larget than B");
			}else {
			System.out.println("B is larger than A");
		}	
	}
	void hello() { //method signature
		System.out.println("Hello"); //method body
	}

}
