package com.class17_2;

public class CarMileage {

	public static void main(String[] args) {
		// 9999
		
		CarMileage mil =new CarMileage();
		mil.printMil();
		
		
		
	
		
	}
	void printMil() {
		
		for (int a=0; a<=9; a++) { // 0; 1; 2; 3; 
			
			for (int b=0; b<=9; b++) { //00; 01; 02;03
				
				for (int c=0; c<=9; c++) { //000; 001; 002; 003;  
					
					for (int d=0; d<=9; d++) {
						System.out.println(a+""+b+""+c+""+d);// 0000; 0001; 0002; 0003; 
						
					}	
				}
					
			}
		}	
				
	}

}
