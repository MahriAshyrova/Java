package com.class35;

public class NullPointerExceptionTask {
//	* void nullPointer() method to be able to throw NullPointerException Invalid
//    * use of a null reference.
	
void nullPointer( String a) {
		
		System.out.println(a.length());
	}

	public static void main(String[] args) {
		
		NullPointerExceptionTask obj = new NullPointerExceptionTask();
		
		try {
		obj.nullPointer(null);
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
		
}
	
