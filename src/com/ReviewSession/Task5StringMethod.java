package com.ReviewSession;

public class Task5StringMethod {

	public static void main(String[] args) {
        /**
        * Write a program that:
        * Converts all the characters in the string to lower case and prints.
        * Converts all the characters in the string to upper case and prints.
        * Checks whether the string/paragraph starts and ends with the string or word "The" and prints.
        * Counts the number of letter 'a' in the string/paragraph and prints.
        * Prints the second half of the string/paragraph.
        * Prints characters between the 10th and 20th indices(inclusive).
        * Prints the string/Paragraph in reverse order.
        * Clears/removes all white spaces or tabs on both ends and prints.
        */

       String para = "The quick brown fox jumps over the lazy dog.";
		
       int length=para.length();
       System.out.println(length);
       
       String lower=para.toLowerCase();
       System.out.println(lower);
       
       String upper=para.toUpperCase();
       System.out.println(upper);
       
       boolean starts=para.startsWith("The");
       System.out.println(starts);
       
       boolean ends=para.endsWith("The");
       System.out.println(ends);
       
       
       int count=0;
       
       for (int i=0; i<para.length(); i++) {
    	   if(para.charAt(i)=='a'); {
    	   count++;
       }
       }
       System.out.println(count);
       
       String newString=para.substring(para.length()/2);
       System.out.println(newString);
       
       String new1=para.substring(10, 20);
       System.out.println(new1);
       
  
       System.out.println(para.trim());
       
       for(int i=para.length()-1; i>=0; i--){
			System.out.print(para.charAt(i));
			 }
     
       
       
       
       
       
       
       
       
       
       
		
		
	}

}
