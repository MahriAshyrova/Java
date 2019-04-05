package qq2;

public class Task5 {

	public static void main(String[] args) {
		
		// What is the output?

		int arr[]=new int [] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int n=6; 
		n=arr[arr[n]/2]; //6/2=3; 
		System.out.print(arr[n]/2); //3/2=1, since it is an int --->1; 
				
	System.out.println();		
	
	}

}
