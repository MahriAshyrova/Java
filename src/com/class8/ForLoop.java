package com.class8;

public class ForLoop {

	public static void main(String[] args) {

		//initialize, condition/test condition, increment/decrement 
		for (int i=0; i<=5; i++) {
			System.out.println("good morning "+i);
		}
	//I want to print numbers from 10-1
		
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}
	//what is the output
		
	for (int a=0; a<=20; a+=2)	{
		System.out.println(a);
	}
		
	for (int b=1; b<=50; b+=5) {
		System.out.println(b);
	}
	// print numbers from 1-100
	
	for (int i=1; i<=100; i++) {
		System.out.println(i);
	}
	System.out.println();
	
	// print numbers from 100-1
	for (int i=100; i>=1; i--) {
		System.out.println(i);
	}
	System.out.println();
	
	//print odd numbers from 1-20 (2 ways)
	
	for (int i=1; i<=20; i+=2) {
		System.out.println(i);
	}
	
	
	
	System.out.println();
	
	//print even numbers from 20-1 (2 ways)
	for (int i=20; i>=1; i-=2) {
		System.out.println(i);
	}
	
	System.out.println();
	
	for (int i=20; i>=1; i--) {
		if (i%2==0) {
		System.out.println(i);
		}
	}
	
System.out.println();


//print even numbers between 20-50 (2 ways)
 for (int a=20; a<=50; a+=2) {
	System.out.println(a);
	
}
 System.out.println();
 
 for (int a=20; a<50; a++) {
	 if (a%2==0) {
		System.out.println(a);
	 }
	}
	 System.out.println();
 
 
//print odd numbers between 20-50 (2 ways)
for (int a=20; a<=50; a+=2) {
	System.out.println(a);
	
}
System.out.println();

for (int a=21; a<=50; a++) {
	if (a%2!=0) {
	System.out.println(a);
	}
}



	}

}




























