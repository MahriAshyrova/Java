package com.class22;

public class ClassStudents {
	/*
	Write a java program of Class Students that takes students name and 3 subject grades. Inside your class also have a method to Calculate Average Grade.
	 Test Student class for 5 different students with different marks. Your program should print an average mark of each students name.
	NOTE: please male different names for instance and local variables.

*/
	public String studentName;
		
	ClassStudents (String name) {
		System.out.print("My name is "+name);
		
	}
	
	
	int CalculateAverageGrade (int a, int b, int c) {
		
		 int aver=0;
		 aver+=(a+b+c)/3;
		 System.out.println(" and my average grade score is "+aver);
		
		 return aver;
		
		
	}
	
	
	
	
}
