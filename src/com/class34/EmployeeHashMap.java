package com.class34;

import java.util.*;

public class EmployeeHashMap {
	//	2. Write a program to check which employee gets highest salary 
	//	use hashmap employee name as key and salary amount as the value.
	//	Output example: John Smith=100000.
	public static void main(String[] args) {
		
		
		Map<String, Integer> salaryMap=new HashMap<>();
		salaryMap.put("John", 70000);
		salaryMap.put("James", 80000);
		salaryMap.put("Frank", -90000);
		salaryMap.put("David", 60000);
		salaryMap.put("Jordan", -50000);
		
		int maxSalary=Integer.MIN_VALUE;
		String key=null;
		
		for(Map.Entry<String, Integer> entry:salaryMap.entrySet()) {
			if(entry.getValue()>maxSalary) {
				maxSalary=entry.getValue();
				key=entry.getKey();
			}
		}
		System.out.println(maxSalary+" belongs to "+key);
		
	}

}
