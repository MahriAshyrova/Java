package com.class31;

import java.util.ArrayList;

public class ArrayListRemoveEveryOtherElement {
	public static void main(String[] args)
	{
		ArrayList<String> arrlist=new ArrayList<String>();
		
		arrlist.add("hi");
		arrlist.add("yo");
		arrlist.add("sup");
		arrlist.add("yolo");
		arrlist.add("boop");
		
		for(int i=0;i<arrlist.size();i++) {
			arrlist.remove(i);
		}
		
		for (Object object : arrlist) {
			System.out.print(object+" ");
		}
	}

}
