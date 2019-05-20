package com.Class19interviewQuestions1;

public class Task2 {

	public static void main(String[] args) {
		
		// Write a java program to find the second largest number in the array? 
		// Maximum and minimum number in the array?	
		
	int[] arr = {100, 46, 0, 86, 292, 101};
	
	int min =arr[0]; 
	int secondLargest =0; 
	int largest =0;	
		
	for (int a:arr) {
		if(a>largest) {
			largest=a; 
		}
		if (a<min) {
			min=a;
		}}	
	for (int a:arr) {
		if (a>secondLargest && a<largest) {
			secondLargest=a;
		}}
	 System.out.println("min = " + min);
     System.out.println("Second Largest = " + secondLargest);
     System.out.println("Largest = " + largest);
     
     System.out.println("--------------------------");	
		
		
    int[] numArr = {100, 46, 0, 86, 292, 101};
	
    int mnm =numArr[0]; 
 	int secLar =numArr[0]; 
 	int max =numArr[0];	
	
	for (int a:numArr) {
		if(a>max) {
			secLar=max;
			max=a;
		}else if(a>secLar && a!=max) {
			secLar=a;
		}
	}
	System.out.println(mnm);
    System.out.println(secLar);
    System.out.println(max);
	
	
	
	
	
}	
}
