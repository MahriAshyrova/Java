package SelfPractive;

public class ifArrayIsSquareOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 int[][] b = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
	 boolean isSquare=true;
	 isSquare = true;
	 for(int row = 0; row < b.length; row++){
	 for(int col = 0; col < b[row].length; col++)
	     if(b.length != b[row].length)
	         isSquare = false;
	 }

	 
	 System.out.println(isSquare);	

	}

}
