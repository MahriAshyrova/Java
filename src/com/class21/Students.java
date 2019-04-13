package com.class21;

public class Students {
	
	String studentName;
	int studentID;
	public static int numberOfStudents;

	public static void main(String[] args) {
		
		/*  Create a Class called Students

		Create three  variables  studentName , studentID  and  numberOfStudents
		Create three objects of the Students Class
		Set the value for  studentName , studentID and increment  the numberOfStudents for each object
		Print out  total number of students
		*/
		
		Students s1= new Students();
		s1.studentName="Mike";
		s1.studentID=11;
		numberOfStudents++;
		s1.getStudentInfo();
		
		
		Students s2= new Students();
		s2.studentName="Marina";
		s2.studentID=22;
		numberOfStudents++;
		s2.getStudentInfo();
		
		Students s3= new Students();
		s3.studentName="Misha";
		s3.studentID=33;
		numberOfStudents++;
		s3.getStudentInfo();
		
		
		
		

	}
	
	public void getStudentInfo() {
		System.out.println("The total number of students is "+numberOfStudents);
	}

}
