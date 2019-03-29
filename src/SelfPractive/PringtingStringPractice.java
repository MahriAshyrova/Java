package SelfPractive;

public class PringtingStringPractice {

	public static void main(String[] args) {
		// Create a String named "name" and assign the value "Timmy" to it
		// Find out how many characters are there in the given String

		String name ="Timmy";
		
	  int lengthOfString = name.length();
		
		System.out.println(lengthOfString);
		
		System.out.println("-----");
		//Create a String named s1 = "hello"  check weather string is empty or not
		//Create a String named s2 = ""  check weather string is empty or not
		
		
		String s1="hello";
		String s2="";
		
		boolean isEmpty=s1.isEmpty();
		boolean isEmpty1=s2.isEmpty();
		
		System.out.println(isEmpty);
		System.out.println(isEmpty1);
		
		System.out.println("-----");
		//create first string named str1= syntaxsolutions convert into SYNTAXSOLUTIONS 
		//create first string named str2=  SYNTAXSOLUTIONS  convert into syntaxsolutions
		
		String str1="syntaxsolutions";
		String str2="SYNTAXSOLUTIONS";
		
		String upper=str1.toUpperCase();
		String upper1=str2.toLowerCase();
		
		System.out.println(upper);
		System.out.println(upper1);

		System.out.println("-----");
		/*Validate if the string ends with "u" prints the Boolean value accordingly
		Validate if the string ends with "world" prints the Boolean value accordingly
		Validate if the string ends with "are" prints the Boolean value accordingly
		Validate if the string ends with "you" prints the Boolean value accordingly
		 */		
		
		String sentence="hello how are you"; 
		
		boolean ends =sentence.endsWith("u");
		boolean ends1=sentence.endsWith("world");
		boolean ends2=sentence.endsWith("are");
		boolean ends3=sentence.endsWith("you");
		
		System.out.println(ends);
		System.out.println(ends1);
		System.out.println(ends2);
		System.out.println(ends3);
		
		System.out.println("-----");
		/*
		 * Print out the position of the first occurrence of "c"
		Print out the position of the first occurrence of " "
		Print out the position of the first occurrence of the variable target1
		Print out the position of the first occurrence of the variable target2	
		 */
		
		
		String str = "abracadabra alakazam";
	    String target1 = "dab";
	    String target2 = "ABRA";
	    
	    int index=str.indexOf("c");
	    int index1=str.indexOf(" ");
	    int index2=str.indexOf("dab");
	    int index3=str.indexOf("ABRA");
	    
	    System.out.println(index);
	    System.out.println(index1);
	    System.out.println(index2);
	    System.out.println(index3);

	    System.out.println("-------------");
		/*
		Output 1: print str starting at index 5 and going to the end
		Output 2:  print str starting at index 7 and ending at index 10
		Output 3: print "harambe" this must not be a new string must be from str
		Output 4: print "t f" this must not be a new string must be from str on one line		
		 */
		
	    String strs = "laptops out for harambe";
	    
	    String newString=strs.substring(5);
	    String newString1=strs.substring(7, 10);
	    String newString2=strs.substring(16);
	    String newString3=strs.substring(10, 13);
	    
	    System.out.println(newString);
	    System.out.println(newString1);
	    System.out.println(newString2);
	    System.out.println(newString3);
	    
		System.out.println("---------------");
		/*
		Print out the character in the 5th index of the String str
		Print out the character in the 8th index of the String str
		Print out the character in the 1st index of the String str
		Print out the character in the 10th index of the String str
		 */
		
		String str3 = "boopity bop";

		 char character=str3.charAt(5);
		 char character1=str3.charAt(8);
		 char character2=str3.charAt(1);
		 char character3=str3.charAt(10);
		 
		 
		 System.out.print(character);
		 System.out.print(character1);
		 System.out.print(character2);
		 System.out.print(character3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
