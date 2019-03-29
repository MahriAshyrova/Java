package SelfPractive;

public class duplicatesElementsOfArray {

	public static void main(String[] args) {
		// print duplicates of Elements of an array

		
		String [] names= {"Java", "Phython", "Ruby", "C", "Java", "C"};
		
		//1. compare each element: 0(nxn) solution is the worst solution
		for (int a=0; a<names.length; a++) {
			for (int b=a+1; b<names.length; b++) {
				if(names[a].equals(names[b])) {
					System.out.println("The duplicate element is: "+names[a]);
				}
			}
		}
	
		// 2. using Hashset: Java Collection: it stores unique values:
		
		
		
		
		
		
	}

}
