package com.class34;

import java.util.*;

public class TestPerson {
	//Create a Person class with following private fields: name, lastName, age, salary.
	//Variables should be initialized through constructor.
	//Inside the class also create a method to print user details.
	//In Test Class create a Map to store personId and a Person Object. Print each object details.
	public static void main(String[] args) {
		
		Map<Integer, Person> mapPerson=new LinkedHashMap<>();
		mapPerson.put(1, new Person("Maria", "Marina", 35, 90000));
		mapPerson.put(2, new Person("John", "Smith", 45, 80000));
		mapPerson.put(3, new Person("Jack", "Snow", 55, 70000));
		mapPerson.put(4, new Person("Lary", "Brown", 65, 60000));
		
		Collection<Person> personDetails=mapPerson.values();
		
		for (Person perDet:personDetails) {
			System.out.println();
			System.out.println("Person's name is "+perDet.getName());
			System.out.println("Person's lastname is "+perDet.getLastName());
			System.out.println("Person's age is "+perDet.getAge());
			System.out.println("Person's salary is "+perDet.getSalary());
		}
		
		
		
		
	}

}
