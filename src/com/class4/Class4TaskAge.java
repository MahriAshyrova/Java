package com.class4;

import java.util.Scanner;

public class Class4TaskAge {

	public static void main(String[] args) {
		/*
		 * ask customers age if they = 18 and older give the driving license if not
		 * issue permit
		 */

		int age;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your age");
		age = input.nextInt();

		if (age == 18) {
			System.out.println("You can get a license");
		} else if (age > 18) {
			System.out.println("You can get a license");
		}else {
			System.out.println("You can get a permit");
		}

	}

}
