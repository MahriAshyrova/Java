package com.class35;

public class TestExceptionsReview {

	public static void main(String[] args) {
		
		ExceptionsReview obj1 = new ExceptionsReview();
		
		try {
		obj1.arithmetic(10, 0);
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {	
		}finally {
			System.out.println("I caught every exception");
		}

		ExceptionsReview obj2 = new ExceptionsReview();
		
		try {
		obj2.nullPointer(null);
		}catch (NullPointerException e) {
            System.out.println("I just caught an ArithmeticException");
			System.out.println(e.getMessage());
		}
		
		ExceptionsReview obj3 = new ExceptionsReview();
		
		try {
		obj3.arrayIndexOutOfBounds();
		} catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("I just caught an ArrayIndexOutOfBoundsException");

			System.out.println(e.getMessage());
		}
		
		ExceptionsReview obj4 = new ExceptionsReview();
		
		try {
		obj4.stringIndexOutOfBounds();
		} catch (StringIndexOutOfBoundsException e) {
			 System.out.println("I just caught an StringIndexOutOfBoundsException");
			System.out.println(e.getMessage());
		}
		
		ExceptionsReview obj5 = new ExceptionsReview();
		
		try {
		obj5.negativeArraySizeException();
		} catch (NegativeArraySizeException e) {
			 System.out.println("I just caught an NegativeArraySizeException");

			System.out.println(e.getMessage());
		}
		
		ExceptionsReview obj6 = new ExceptionsReview();
		
		 try {
	            // Exception
	            obj6.throwsMethod();
	        }catch (NegativeArraySizeException e) {
	            System.out.println("I just caught an NegativeArraySizeException");
	            System.out.println(e.getMessage());
	        } catch (Exception e) {

	            System.out.println("I just caught an Exception");
	            System.out.println(e.getMessage());
	        } finally {
	            System.out.println("Hey, I just caught Every type of Exception");
	        }
	}

}
