package com.class17_2;

public class Task4 {

	public static void main(String[] args) {
		/*Print the following pattern:
*
**
***
****
*****-5 rows, columns depend on rows
****
***
**
*
		 */
		
		for (int a=1; a<=5; a++) {
			for (int b=1; b<=a; b++) {
		
				System.out.print("*");		
			}
	              System.out.println();					
}
		
		for (int a=1; a<=4; a++) {
			for (int b=4; b>=a; b--) {
		
				System.out.print("*");		
			}
	              System.out.println();	
	              
}



		
	}

}
