package com.class30;

import java.util.ArrayList;

public class MyStringList {

//	In this exercise, you will create a class called MyStringList that will be a “growable” array for Strings. 
//	In fact, you will implement this class by having a private array strArray of Strings in the background, 
//	but a user will not know about your implementation. 
//	A user will know only that you will provide the ability for the user to add, remove
	
	private String name;
	private String address;
	private String mobile;
	
	public MyStringList(String name, String address, String mobile) {
		super();
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void printDetails() {
		System.out.println(name+" "+address+mobile);
	}
}
