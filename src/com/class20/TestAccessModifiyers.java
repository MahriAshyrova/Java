package com.class20;

public class TestAccessModifiyers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Task3 obj=new Task3();
		obj.isPalindrome("madam"); //accessing public method
		obj.reverseString("hello"); // accessing protected method
		obj.sayHello(); // accessing dafault method 
		
		System.out.println(obj.name1); //accessing deafult variable
		System.out.println(obj.name2); //accessing protected variable
		System.out.println(obj.name3); //accessing public variable
		//obj.getWords("Hello students"); - is not available, private method is not accessible 
		
		
		
		
	}

}
