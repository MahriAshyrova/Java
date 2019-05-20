package com.class25;

public class SyntaxStudent extends Student {
	
//	public boolean study() { - not possible as return types must be the same
//		System.out.println("Syntax students must study HARD");
//		return true;
//	}
	
	protected void doHomework() {
		System.out.println("Syntax students must do REPL");
	}
	
	protected void attendClasses(String str, int num) {
		System.out.println("Syntax students must attend ALL classes AND TAKE NOTES");
	}
	//private methods don't get inherited and cannot be overriden
	private void doResearch() {
		System.out.println("Syntax students must make uncle GOOGLE BEST FRIEND");
	}
	
	
	

}
