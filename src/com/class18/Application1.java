package com.class18;

public class Application1 {

	public static void main(String[] args) {
		

		Animal dog=new Animal();
		
		System.out.println(dog.breed);
		System.out.println(dog.name);
		System.out.println(dog.weight);
		System.out.println(dog.age);
		
		System.out.println(dog.canBark());
		System.out.println(Animal.isWild());
		
		dog.name="Snowy";
		dog.age=10;
		System.out.println(dog.age);
		
		Animal dog1=new Animal();
		
		System.out.println(dog1.breed);
		System.out.println(dog1.name);
		System.out.println(dog1.weight);
		System.out.println(dog1.age);
		
		System.out.println("-------------------------------");
		
		Animal dog2=new Animal();
		
		System.out.println(dog2.breed);
		System.out.println(dog2.name);
		System.out.println(dog2.weight);
		System.out.println(dog2.age);
		
		System.out.println("-------------------------------");
		
		int my_array[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.println("Printing the minimum");
		
		System.out.println(Minimum.minOfValues(my_array));
		System.out.println(Minimum.MaxOfValues(my_array));
		
		System.out.println();
		
		Calculator calc=new Calculator();
		
		System.out.println(calc.sum(2, 3, 5));
		System.out.println(calc.aver(2, 3, 5));
		System.out.println(calc.min(2, 8, 9));
		System.out.println(calc.max(4, 7, 5));
		
		
	}

}
