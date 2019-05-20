package com.class25;

public class Test {

	public static void main(String[] args) {
		
		
		Student stu =new SyntaxStudent();
		stu.study();
		stu.doHomework();
		stu.attendClasses("Hello", 10);
		// stu.research(); - private method doesn't get inherited and cannot be overriding 

	}

}
