package com.ReviewSession;

public class ArrayTask4 {

	public static void main(String[] args) {
		// Write a program to find the maximum and minimum value of an array. 
		
	
		int[] array= {2, 5, 9, 56, 78, 98};
		
			int maxValue = array[0];
			for(int i=1; i<6; i++){
			  
				
		    if(array[i] > maxValue){
			  maxValue = array[i];
			}
		  }
		
			int minValue = array[0];
			for(int i=1; i<6; i++){
		    if(array[i] < minValue){
			  minValue = array[i];
			}
		  }
		  
		  System.out.println(maxValue+" is the max value of an array"); 
		  System.out.println(minValue+ " is the min value of an array"); 
		}		
		
	}


