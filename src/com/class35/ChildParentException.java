package com.class35;

public class ChildParentException {

	public static void main(String[] args) {
		
		int [] array = {17, 99, 8};
		
		try {
		Thread.sleep(2000);
		System.out.println(array[3]); // ArrayIndexOutOfBoundsException
		
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
	
		}
		System.out.println("Code after the exception");
		
		ArrayIndexOutOfBoundsException e= new ArrayIndexOutOfBoundsException();
		Exception e1= new ArrayIndexOutOfBoundsException();
		
		
		
		
		
	}

}
