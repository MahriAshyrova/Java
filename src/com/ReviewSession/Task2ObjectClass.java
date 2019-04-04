package com.ReviewSession;

public class Task2ObjectClass {

	public static void main(String[] args) {
		
		/* create a method that shows you all the vowals in a string
	     * output: should only show these characters a,e,i,o,u,A,E,I,O,U,
	     * this method can have any string value you put in, but must return
	     * all the vowals within the string
	     */
		
	
	Task2ObjectClass task2=new Task2ObjectClass();
		task2.vowelCountWithLoop();
		task2.vowelCountWithReplaceAll();
	}
		
	void vowelCountWithLoop() {
	       
			String str="I like reading and walking";
	        char[] w=str.toCharArray();
	        char empty;
	        for(int i=0;i<=w.length-1;i++) {
	            if(w[i]=='a'||w[i]=='A'||w[i]=='e'||w[i]=='E'||w[i]=='i'
	                    || w[i]=='I'||w[i]=='o'||w[i]=='O'||w[i]=='u'||w[i]=='U') {
	                empty=w[i];
	                System.out.print(empty+",");
	                
	            }
	            
	        }	
	        System.out.println("--------------------------");	
	}
	
	void vowelCountWithReplaceAll () {

		String str="I like reading and walking";
		String replace=str.replaceAll("[^aA,eE,iI,oO,uU]", "");
		System.out.println(replace);	
			
	}
	
	
	}


