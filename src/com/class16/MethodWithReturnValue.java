package com.class16;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		
		
		String str="Hello";

		int stringLength=str.length();
		System.out.println(stringLength);
		
		char character=str.charAt(3);
		System.out.println(character);
		
		MethodWithReturnValue obj=new MethodWithReturnValue();
		//String str=obj.askHowAreYou("Asel");
		String day=obj.whatIsADay();
		System.out.println("Today is "+day);
		obj.whatIsTheLargestNumber(20, 10);
		int largestNum=obj.findLargestNum1(20, 10);
		
		boolean isOdd;
		
		if(largestNum%2==0) {
			isOdd=false;
			}else {
				isOdd=true;
			}
		System.out.println(isOdd);
		}
			

	}
	void askHowAreYou(String name) {
		System.out.println("How are you "+name+"?");
	}
	String whatIsADay() {
		System.out.println("I am inside of a method");
		return "Thursday";
	}
	
	int whatIsTheLargestNumber(int a, int b) {
	
		if(a>b) {
			return a;
		}else {
			return b;
		}
		void largestNum(int a1, int b1) {
			
			if(a1>b1) {
				System.out.println("A is larger than B");	
			}else {
				System.out.println("B is larger than A");
			}	
}
}
