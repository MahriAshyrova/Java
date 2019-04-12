package com.class21;

public class Employee {
	
	public int eID;
	public int salary;
	public static String CEO = "Sumair";
	
	

	public static void main(String[] args) {
		
		/*Create a Class called Employee:
			Create three  variables  eID , salary and set the CEO to “Sumair”
			Create two objects of the class Employee
			Set the value of eID, salary for each of the objects
			Print out the eID , salary and  CEO for each of the objects
			*/
		
		Employee emp1 = new Employee();
		emp1.eID=1235;
		emp1.salary =100;
		CEO="Asel";
		
		System.out.println("The employee ID is "+emp1.eID+", the salary of the employee is "+emp1.salary+", and the CEO is "+CEO);

		
		
		Employee emp2 = new Employee();
		emp2.eID=54321;
		emp1.salary =150;
		CEO="Arif";
		
		
		System.out.println("The employee ID is "+emp2.eID+", the salary of the employee is "+emp2.salary+", and the CEO is "+CEO);
		
		
		
		
		

	}

}
