package com.class25;

public class Student {
	
	public void study() {
		System.out.println("Students must study");
	}
	
	protected void doHomework() {
		System.out.println("Students must do homework");
	}
	
	void attendClasses(String str, int num) {
		System.out.println("Students must attend the classes");
	}
	// creating child specific private method doReserch
	private void doResearch() {
		System.out.println("Students must do research");
	}
	
	
}
