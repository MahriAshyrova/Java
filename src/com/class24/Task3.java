package com.class24;

public class Task3 {
	
	private void methodOverload() {
		System.out.println("null");
	}
	
	private void methodOverload(String str) {
		System.out.println(str);
	}
	
	private void methodOverload(int a, int b ) {
	System.out.println(a+b);
}
	

	public static void main(String[] args) {
		// Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result
		
		Task3 obj = new Task3();
		
		
		obj.methodOverload();
		obj.methodOverload("Bye");
		obj.methodOverload(5, 5);
		

	}

}
