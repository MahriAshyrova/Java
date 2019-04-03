package com.interviewQuestions1;

public class Task1 {

	public static void main(String[] args) {
		
		// 1. Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a temporary variable?

		// 2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

		// 3. Find out how many alpha characters present in a string?

		// 4. How to find out the part of the string from a string? What is substring? Find number of words in string?

		// 5. Write a java program to reverse String? Reverse a string word by word?
		
		
		
		
		int a = 10; 
        int b = 5; 
        
        a = a + b;  // a=10+5=15;
        b = a - b;  // b= 15-5=10;
        a = a - b;  // a=10-5=5; 
        
        System.out.println("After swaping:"
                           + " a = " + a + ", b = " + b); 
		
       // int x = 5, y = 10;
       // x = x ^ y ^ (y = x);
       // System.out.println(x +" "+y);	
        
        
        System.out.println();
        
        String x="Hello";
        String y="Bye";
       
        System.out.println("Before swap: " + x + " " + y);  
        
        
        
        x = x + y;  // Hello+Bye=HelloBye
        y = x.substring(0, x.length() - y.length());  // Hello(HelloBye-Bye)=Hello
        x = x.substring(y.length());  // HelloBye(Hello)=Bye
        
        System.out.println("After : " + x + " " + y);  
        
        
       // Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a temporary variable? 
        
        
        int a1=10;
		int b1=20;
		
		a1=a1+b1;//30
		b1=a1-b1;//30-20=10
		a1=a1-b1;//30-10=20
		
		System.out.println("The value of a="+a1+" value of b="+b1);
		
		System.out.println("--------------------------------");

		String str1="Hello";//5
		String str2="World";//5
		
		str1=str1+str2;
        str2=str1.replaceAll(str2,"");
        str1=str1.replaceAll(str2, "");
        
        System.out.println(str1);
        System.out.println(str2);
        
        System.out.println("--------------------------------");
        
        String str3="Hello";//5
		String str4="World";//5
        str3=str3+str4;//HelloWorld-->10
		str4=str3.substring(0, str3.length()-str4.length());//Hello
		str3=str3.substring(str4.length());
		
		System.out.println("The value of str1="+str3+" value of str2="+str4);
		
         
        
        
        
        
        
 
 
        
        
        
		

	}

}
