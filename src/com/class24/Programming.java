package com.class24;


public class Programming {
	
	
	
	Programming() {
		System.out.println("I love programming languages");
	}
	
	Programming(String a) {
		System.out.println(a);	
	}
	
	

	public static void main(String[] args) {
		
		Programming obj = new Programming();
		Programming obj1 = new Programming("I love Java");
		
		
		/*Create a class named ‘Programming’.
		While creating an object of the class, if nothing is passed to it, then the message “I love programming languages” should be printed.
		 If some String is passed to it, then in place of “programming languages” the value variable should be printed. 
		Example, if we pass “Java”, then “I love Java” should be printed.
		*/
		
		
	

	}

}
