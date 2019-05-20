package ReviewPackage;

public class Constructors {

		Constructors(){
		this(1);
		System.out.println("no par constructor");
		}

		Constructors(double x){
		this('1', '2');
		System.out.println("1 par constructor");
		}
		
		Constructors(char x, char y){
		System.out.println("2 par constructor");
		}
		public static void main(String[] args) {
		
		Constructors obj=new Constructors();
		}
	}
	 
