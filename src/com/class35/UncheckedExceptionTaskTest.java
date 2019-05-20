package com.class35;

public class UncheckedExceptionTaskTest {

	public static void main(String[] args) {
		
			
			UnchekedExceptionTask obj = new UnchekedExceptionTask();
			
			try {
			obj.arithmetic(10, 0);
			}catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}catch (Exception e) {
				
			}finally {
				System.out.println("I caught every exception");
			}

	}

}
