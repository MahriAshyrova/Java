package com.Class19interviewQuestions1;


	class ReviewCl {
		
		//public static void main (String [] args) {
			
			
		// 1. Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a temporary variable?

		// 2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?

		// 3. Find out how many alpha characters present in a string?

		// 4. How to find out the part of the string from a string? What is substring? Find number of words or an array of words in string?

		// 5. Write a java program to reverse String? Reverse a string word by word?
				
		// 6. Write a Java Program to find whether a String is palindrome or not? palindrone examples: madam, civic, refer
				
			// 7. Write a java program to check whether a given number is prime or not? 
			// Prime number should meet 2 conditions: divisible by 1 and byItself ONLY
		    // examaples for prime numbers: 2, 3, 5, 7, 11, 13, 17, 19, 23, 19
				
		// 8. Write a Java Program to print first 10 numbers of Fibonacci series. 
			// The first 8 numbers of the fibonacci sequence are 0, 1, 1, 2, 3, 5, 8, 13	
	
//	class student{
//		int a; 
//		
//		public: void disp()
//		{ cout<<a;} 
//		
//	};
//	
//	class student{ 
//		
//		int a; public: int b;
//		
//	};
//	
//	void main(){ 
//		
//		int a; 
//		void fun( int a=10; cout<<a);
//		fun(); }
//	
//	struct topper{ 
//		char name[10];
//		public : int marks; }

			String str = "";
			String str2 = "";    
			ReviewCl() {
				this("z");       
				System.out.print(str + str2);  // xy  
				}  
			ReviewCl(String str) {
				this("x", "y");
				this.str += str;  //  this.str=this.str+str=x+z=xz;    
				System.out.print(this.str + str2);    }   // xz+y=xzy;
			ReviewCl(String str, String str2) {
				this.str += str; 		// this.str=this.str+str=0+x=x;
				this.str2 += str2;      // this.str2=this.str2+str2=0+y=y; 
				System.out.print(this.str + this.str2);  // (x+y)=xy;  
				}
		public static void main(String[] args) {        
			ReviewCl mc = new ReviewCl();   
			
			//xy xzy zy 
			}
	}
//	String str = "x";
//	String str2 = "y";   
//	
//	ReviewCl() { 
//		
//	this("z");     
//	
//	System.out.print(str + str2);  // x+y=xy; 
//	}   
//	
//	ReviewCl(String str) {
//		
//	this("x", "y");
//	this.str += str;    // this.str=this.str+str=x+z=xz;
//	
//	System.out.print(this.str + str2);    //xz+y=xzy;
//	}  
//	
//	ReviewCl(String str, String str2) {
//		this.str += str;  // this.str=this.str+str; this.str=0+x=x; 
//		this.str2 += str2;   // this.str2=this.str2+str2; this.str2=0+y=y; 
//		
//	System.out.print(this.str + this.str2);   // x+y=xy;
//	}
//	public static void main(String[] args) {     
//		ReviewCl mc = new ReviewCl();    
//	
//	
		// xyxzyxzy
		
	
	
	
	
	
	
	
   	
	


