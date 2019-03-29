package com.class12;

public class StringManupulations2 {

	public static void main(String[] args) {
		// contains() --->checks for specific value in the string
		// if value is present --->true, else--->false
		
		String str="Good Morning, stdents!";
		boolean contains= str.contains("Morning");
		System.out.println(contains);
		
		
		String 	present="Welcome, Asel!";
		String neededValue="Welcome,";
		boolean flag=present.contains(neededValue);
		System.out.println(flag);
		
		boolean flag1=present.toLowerCase().contains(neededValue);
		System.out.println(flag1);
		
		// StartsWith(), endsWith() --> will return true if String start/ends with , else--->false
		System.out.println("------------------StartsWith & endsWith-----------------");
		String str1="syntax";
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		
		boolean ends=str1.endsWith("y");
		System.out.println(ends);
		
		//isEmpty() if length of a string is =0-->string is empty, else--->it is not easy
		System.out.println("------------------isEmpty-----------------");
		String str2="Hello";
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty);
		System.out.println("--------------------");
		
		//concat() ---> will concatinate two strings 
		String str3="Hello ";
		String str4="Ali!";
		System.out.println(str3+str4);
		
		System.out.println(str3.concat(str4));
		
		
		
		// trim () ---> will remove spaces at the beginning and at the end of your string 
		System.out.println("-------------------------");
		String expected="You may qualify for a multi-policy discount!";
		String actual=" You may qualify for a multi-policy discount! ";
		
		System.out.println(expected.equals(actual));
		
		actual=actual.trim();
		System.out.println(expected.equals(actual));
		
		
		
		
		
		
		
		
		
		

	}

}
