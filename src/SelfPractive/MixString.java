package SelfPractive;

public class MixString {
	
	String mixString(String s1, String s2) {
		
		String mixed = "";
		for (int i=0; i<s1.length(); i++) {
			mixed=mixed+(s1.substring(i, i+1)+s2.substring(i, i+1));
		}
		return mixed;
	}
	

	public static void main(String[] args) {
		
		MixString newStr= new MixString();
		newStr.mixString("12345", "abcde");
		
	System.out.println(newStr.mixString("12345", "abcde"));	
	System.out.println(newStr.mixString("howdy", "hello"));	
	}
	
	
//	String mixString(String s1, String s2){
//		  
//		String str = "";
//	    int len = 0;
//	    
//	  if (s1.length() >= s2.length())
//	    {
//	        len = s1.length();
//	    } else
//	        len = s2.length();
//
//	    
//	    for (int i = 0; i < len; i++)
//	    {
//
//	        if (i < s1.length())
//	        {
//	            str += s1.charAt(i);
//	        }
//
//	        if (i < s2.length())
//	        {
//	            str += s2.charAt(i);
//	        }
//
//	    }
//	    return str;
//		}
//			System.out.println(obj.mixString("12345","abcde")); //should be 1a2b3c4d5e
//			System.out.println(obj.mixString("howdy","hello")); //should be hhoewldlyo
//		}
//	
	
	

}



