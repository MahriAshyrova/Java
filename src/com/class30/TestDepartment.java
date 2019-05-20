package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class TestDepartment {

	public static void main(String[] args) {
		
		
		ArrayList<Department> department = new ArrayList();
	
		department.add(new Professor("John Snow", "123 abs st", 9600, "Benz", "12/10/2010", "1234567878"));
		department.add(new Professor("Arias Snow", "123 abs st", 9600, "Benz", "12/10/2010", "1234567878"));
		department.add(new Professor("Tom Snow", "123 abs st", 9600, "Benz", "12/10/2010", "1234567878"));

		department.add(new Secretary("Anna Snow", "123 abs st", 9600, "Benz", "12/10/2010", "1234567878"));
		department.add(new Secretary("More Snow", "123 abs st", 9600, "Benz", "12/10/2010", "1234567878"));
			        
		Iterator<Department> it = department.iterator();
		
		double departmentSalary =0; 
		
		while(it.hasNext()) {
			departmentSalary += it.next().getSalary();
		}
		
		
		for (Department dep: department) {
			departmentSalary +=dep.getSalary();
		}
		
		System.out.println("Department salary total = "+(departmentSalary));
		
  //System.out.println("Department salary total = "+ (p1.getSalary() + p2.getSalary() + p3.getSalary() + s1.getSalary() + s2.getSalary()));
			        
			 
		
		
		
		

	}

}
