package com.Class19interviewQuestions1;

public class Task2 {

	public static void main(String[] args) {
		
		// Write a java program to find the second largest number in the array? 
		// Maximum and minimum number in the array?

		
		
		
		
	int arr[] = {1000, 46, 0, 86, 292, -1};
	
	int min =arr[0]; 
	int secondLargest =0; 
	int largest =0;	
		
	
	for (int a:arr) {
		if(a>largest) {
			largest=a; 
		}
		if (a<min) {
			min=a;
		}
	}
		
	for (int a:arr) {
		if (a>secondLargest && a<largest) {
			secondLargest=a;
		}
	}
	
	 System.out.println("min = " + min);
     System.out.println("Second Largest = " + secondLargest);

     System.out.println("Largest = " + largest);
     
     
	System.out.println("--------------------------");	
		
		
	int [] array = {1, 2, 3, 4, 98, 6};
	int highest=0;
	int h2=0;
	
	
	for (int i=1; i<array.length; i++) {
		if (array[i]>highest) {
		h2=highest;
		highest=array[i];
		}else if (array[i]>h2) {
			h2=array[i];
		}
	}
	System.out.println("The second highest "+h2);		
	
	int max=array[0];
	
	
	for (int y=1; y<array.length; y++) {
		if (array[y]>max) {
			max=array[y];
		}
	}
	
	int min1=array[0]; 
	for (int w=0; w<array.length; w++) {
		if (array[w]< min1) {
			min1=array[w];
		}
	}
	
	System.out.println(max+" "+min1);
	
	System.out.println("------------------");
	
	
	int min2=array[0];
	int max2=array[0];

	  for (int i=0;i<array.length;i++) {
	      if (array[i] > max2) {
	          max2 = array[i];
	             }
	  else if (array[i] < min2) {
	          min2 = array[i];
	  }      
	}System.out.println(max2); System.out.println(min2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
