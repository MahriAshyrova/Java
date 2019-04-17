package com.Class19interviewQuestions1;

public class MixedString {

	public static void main(String[] args) {
		
		
		 MixedString obj=new MixedString();
		   System.out.println(obj.mixString("12345","abcde")); //should be 1a2b3c4d5e
		   System.out.println(obj.mixString("howdy","hello")); //should be hhoewldlyo
	}
		
		String mixString(String s1, String s2)    {

	          String a="";
	          for (int i = 0; i < s1.length(); i++) {
	                for (int j = i; j < s2.length(); j++) {
	                    a=a+s1.charAt(i) + s2.charAt(j);
	                    //System.out.print(a);
	                    break;
	                }
	        }
	        return (a);
	            
	                          
	}	
		
	}


