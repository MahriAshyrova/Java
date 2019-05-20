package com.class36;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		
		StringBuffer sb = new StringBuffer ("Hello");
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		System.out.println("-----------");
		
		String str ="Good Morning!";
		str.concat("John");
		System.out.println(str);
		
		System.out.println("-----------");
		
		StringBuffer sb1 = new StringBuffer ("Good Morning, ");
		sb1.append("John!");
		System.out.println(sb1);
		
		
		
		
	}

}
