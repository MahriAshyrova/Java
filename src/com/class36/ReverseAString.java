package com.class36;

public class ReverseAString {

	public static void main(String[] args) {
		

		String str= "Sunday";
		String reversed = "";
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		for(int i=str.length()-1; i>=0; i--) {
			reversed= reversed+str.charAt(i);
		}
		
		System.out.println("Reversed string is "+reversed);

	}

}
