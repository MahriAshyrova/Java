package qq2;

public class Task7 {

	public static void main(String[] args) {
		// What is the output?

		int array[][]= {{1, 2, 3},
				        {4, 5, 6}, 
				        {7, 8, 9}}; //45
		int sum1=0; 
		for (int i=0; i<3; ++i) 
			for (int j=0; j<3; ++j) 

				sum1=sum1+array[i][j];

System.out.println(sum1/5);//45/5=9;

		
	}

}
