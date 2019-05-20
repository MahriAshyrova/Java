package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentsTest {

	public static void main(String[] args) {
		
	Students st1=new Students("John", 101);
	//System.out.println(st1.name);
	Students st2=new Students("Mike", 101);
	Students st3=new Students("Jane", 101);
	Students st4=new Students("Josh", 101);

	ArrayList<Students> alist= new ArrayList<>();
	alist.add(st1);
	alist.add(st2);
	alist.add(st3);
	alist.add(st4);


	for (Students student:alist) {
		//student.printStDetails();
		System.out.println(student.name);
	}
	
	
	Iterator <Students> it= alist.iterator();
	while (it.hasNext()) {
		Students obj=it.next();
		obj.printStDetails();
	}
	
		
	}

}
