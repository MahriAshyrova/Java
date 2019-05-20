package com.class35;

public class MultipleCatch {

	public static void main(String[] args) {
		
		System.out.println("Beginning of the code");
		try {
			Thread.sleep(2000); // new InterruptedException ();
			System.out.println(10/0); // new ArithmeticException();
		}catch (ArithmeticException e) {
			
			// print name and details of an exception
		    // e.printStackTrace(); // name of E, detail of E, location
			// System.out.println(e); // name of the E and details
			System.out.println(e.getMessage());
			
			System.out.println("Code of Arithmetic Exception catch");
			
		}catch(InterruptedException e) {
			System.out.println("Code of (Interrupted Exception catch");
		}

	}

}
