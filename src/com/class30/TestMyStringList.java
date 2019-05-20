package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class TestMyStringList {

public static void main(String[] args) {
	
		//ArrayList< MyStringList> al= new ArrayList();
	
		
		MyStringList l1=new MyStringList("Leyli,", "123 Abc str,", " 129876");
		MyStringList l2=new MyStringList("Leyli,", "123 Abc str,", " 129876");
		MyStringList l3=new MyStringList("Leyli,", "123 Abc str,", " 129876");
		
		ArrayList< MyStringList> al= new ArrayList();
		al.add(l1);
		al.add(l2);
		al.add(l3);

		for (MyStringList list:al) {
			list.printDetails();
		}
	}
}
