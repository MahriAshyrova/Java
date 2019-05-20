package com.class34;
//Create a Person class with following private fields: name, lastName, age, salary.
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map to store personId and a Person Object. Print each object details.
public class Person {
	private String name;
	private String lastName;
	private int age;
	private int salary;
	
	Person(String name, String lastName, int age, int salary) {
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
