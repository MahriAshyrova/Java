package com.class24;

public class TestOverloading {
	
	
	public int test(double a) {
		System.out.println();
		return 5;
	}
	
	public void test() {
		System.out.println("I am a public method");
	}
	
	protected void test(String str) {
		System.out.println("I am a protected method");
	}
	
	 void test(String str, int num) {
		System.out.println("I am a default method");
	}
	
	private void test(int num) {
		System.out.println("I am a private method");
	}
	

}

