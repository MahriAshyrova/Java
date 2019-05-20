package com.Class19interviewQuestions1;

import com.classReview.Child2;

public class MixedString {

	public static void main(String[] args) {
		
		
		 MixedString obj=new MixedString();
		   System.out.println(obj.mixString("12345","abcde")); //should be 1a2b3c4d5e
		   System.out.println(obj.mixString("howdy","hello")); //should be hhoewldlyo
		   
		   
		   MixedString obj1 = new MixedString();
			System.out.println(obj1.reverse("one", "two"));
		   
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
		// mixed and reversed string 
		
		String reverse(String a, String b) {
			String mixed="";
			if(a.length()==b.length()) {
			 for (int i = 0; i < a.length(); i++) {
	                 mixed=mixed+a.charAt(i)+b.charAt(i);   
			}
			}else {
				System.out.println("Strings are not the same length");
				}

			return (mixed);
		
		
		
		
		}
		
	}


