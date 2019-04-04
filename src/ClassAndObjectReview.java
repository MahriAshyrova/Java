import java.util.Scanner;

public class ClassAndObjectReview {
	
	
	String eyes, hair, nose, shirt;

	public static void main(String[] args) {
		// Review of Class and Object
	
		ClassAndObjectReview day1=new ClassAndObjectReview();
	
		day1.eyes="blue";
		day1.hair="blond";
		day1.nose="brown";
		day1.shirt="grey";
		day1.eyes="green";
		day1.humanEyes();
		day1.noReturn();
		
		ClassAndObjectReview day2=new ClassAndObjectReview();
		day1.eyes="green";
		System.out.println(day1.eyes);
		
		day1.scannerFirstName();
		day1.noReturn();
		day1.scannerInt();
		
	}

	void humanEyes() {
		ClassAndObjectReview day1=new ClassAndObjectReview();
		day1.eyes="blue";
		System.out.println(day1.eyes);
	}
	
	void noReturn() {
		System.out.println("I do not have a return");
	}
	
	void scannerFirstName() {
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
	}
	
	void scannerInt() {
		Scanner scan=new Scanner (System.in);
		scan.nextInt();
	}
	
	
	
	
	
	
	
}
