package com.class6;

import java.util.Scanner;

public class SwitchTask3 {

	public static void main(String[] args) {
		// Using the scanner class create a calculator
		// ask user to enter two numbers and operator(+-*/)
		// based an operator provide result to user 
//
//	int num1, num2;
//	String oper;
//	double result = 0;
//	
//	Scanner	input=new Scanner(System.in);
//	System.out.println("Please enter two numbers");
//	num1=input.nextInt();
//	num2=input.nextInt();
//	System.out.println("Please enter the operator");
//	oper=input.next();
//	
//	
//	switch (oper)	{
//	case "+":
//		result=num1+num2;
//		break;
//	case "-":
//		result=num1-num2;
//		break;
//	case "*":
//		result=num1*num2;
//		break;
//	case "/":
//		result=num1/num2;
//		break;
//		default:
//			
//			break;
//	}
//	System.out.println("Your result is "+result);		
//		
//	
//	
//	
	
	// Using the scanner class create a calculator
			// ask user to enter two numbers and operator(+-*/)
			// based an operator provide result to user 
	
	
	double num1, num2;
	char oper;
	double result=0;
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter two numbers");
	num1=scan.nextDouble();
	num2=scan.nextDouble();
	System.out.println("Please enter an operator + - * / ");
	oper=scan.next().charAt(0);
	
	
	switch (oper) {
	case '+':
		result=num1+num2;
		break;
	case '-':
		result=num1-num2;
		break;
	case '*':
		result=num1*num2;
		break;
	case '/':
		result=num1/num2;
		break;
	default:
	System.out.println("Not valid");
	}
		System.out.println("The result is "+result );
	
	
	}

}
