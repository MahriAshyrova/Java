package com.class8;

public class Class8Task {

	public static void main(String[] args) {
		// I want to print numbers from 1-20 but skip those that are divisible by3
		
		for (int i=1; i<=20; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
