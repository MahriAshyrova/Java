package com.class21;

public class Employee {
	
	 int eID;
	 int salary;
	public static String CEO = "Sumair";
	 

	public static void main(String[] args) {
		
		/*Create a Class called Employee:
			Create three  variables  eID , salary and set the CEO to “Sumair”
			Create two objects of the class Employee
			Set the value of eID, salary for each of the objects
			Print out the eID , salary and  CEO for each of the objects
			*/
		System.out.println(CEO);
		
		
		Employee emp1 = new Employee();
		emp1.eID=1235;
		emp1.salary =100;
		emp1.getEmpInfo();
		
		
		
		Employee emp2 = new Employee();
		emp2.eID=54321;
		emp2.salary =150;
		emp2.getEmpInfo();
		
		

	}
	public void getEmpInfo() {
		
		// CEO = "Arif";
		 
		System.out.println("The employee ID is "+eID+", the salary of the employee is "+salary+", and the CEO is "+CEO);
	}

}
