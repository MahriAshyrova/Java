package com.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

//		How would handle InputMismatchException? 
//		Input Mismatch Exception when user enters mismatch value then programmer expected.


public class InputDismatchException {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the zip code");
		try {
			int num = scan.nextInt();
		}catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}

	}

}
