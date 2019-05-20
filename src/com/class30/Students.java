package com.class30;

public class Students {
	
	public String name;
	public int studentId;
	
	Students (String name, int studentId){
		this.name=name;
		this.studentId=studentId;
		
	}
	
	public void printStDetails() {
		System.out.println(name+" "+studentId);
	}

}
