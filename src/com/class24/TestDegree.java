package com.class24;

public class TestDegree {

	public static void main(String[] args) {
		Degree degree= new Degree();
		Undergraduate ug= new Undergraduate();
		Postgraduate pg = new Postgraduate();
		
		
		String printDegree;
		
		printDegree=degree.getDegree();
		System.out.println(printDegree);
		
		printDegree=ug.getDegree();
		System.out.println(printDegree);
		
		printDegree=pg.getDegree();
		System.out.println(printDegree);		
	}

}
