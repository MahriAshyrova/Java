package qq2;

public class Task8 {

	public static void main(String[] args) {
		
		// What is the output? What is the highest element in the array?
		
		int [] array = {1, 4, 3, 6, 8, 2, 5};
		int highest=array[0];
		//scan the array
		
		for (int index=0; index<array.length; index++) {
			if (array[index]>highest)
				highest = array[index];
		}
		
		System.out.println(highest);
		
		
		
	}

}
