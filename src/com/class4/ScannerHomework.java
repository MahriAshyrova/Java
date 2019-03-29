package com.class4;
import java.util.*;
public class ScannerHomework {
  public static void main(String[] args) {
    
    int X,Y;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter first number");
	  X=input.nextInt();
	  System.out.println("Please enter second number");
	  Y=input.nextInt();
	  
    int mul =X*Y;
    if (mul>0){
			System.out.println("true");
		}else {
			System.out.println("false");
		}	
      
  }
}