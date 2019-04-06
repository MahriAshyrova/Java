package com.class17_2;

import com.class17.Calculator;

public class Application {

	public static void main(String[] args) {
		

		Calculator calc= new Calculator();
		
		int x=10, y=100;

		int a= calc.sum(x, y);
		System.out.println(a);
		int b=calc.sub(x, y);
		System.out.println(b);
		int c=calc.mult(x, y);
		System.out.println(c);
		int d=calc.div(x, y);
		System.out.println(d);
		
	}
	
	

}
