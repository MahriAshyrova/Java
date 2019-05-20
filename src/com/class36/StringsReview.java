package com.class36;

public class StringsReview {
	/** Create a class called StringsReview in it
     * Write a program to concatenate or append 'def' to string 'abc' using
     * StringBuffer and string 'ghi' to the concatenated string 'abcdef' using
     * String builder.
     */
	public static void main(String[] args) {
		
		
		
		StringBuffer sb = new StringBuffer("abc ");
		sb.append("def");
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder(sb);
		sb2.append("ghi");
	
		System.out.println(sb2);
	
}
	
	

}
