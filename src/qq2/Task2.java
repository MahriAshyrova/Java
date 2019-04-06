package qq2;

public class Task2 {

	public static void main(String[] args) {
		// 

		
		int [] a= {12, 15, 11, 13, 9, 25};
		int [] a2= {12, 15, 11, 13, 9, 25};
		
		int sum=0; 
		
		 for (int i=0; i<6; i++) {
			 if (a[i]%2==a2[i]%5) {   //11/2=1; 11/5=1;  // 1==1 -remainders are equal;
			//	 i==2
				 
			sum+=i*i; //2*2;	(index=2)  
			 }
		 }
		System.out.println("sum = "+sum);
			
		
		
		
		
		
		
	}

}
