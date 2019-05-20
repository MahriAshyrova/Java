package com.class29;

//2. We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A 
// and in four subjects (each out of 100) by student B. Create class ‘Marks’ with an abstract method ‘getPercentage’. 
// It is inherited by classes ‘A’ and ‘B’ each having a method with the same name which returns the percentage of the students. 
// The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters 
// for student B. Test your code 

abstract class Marks {
	
	abstract double getPercentage();
}
class A extends Marks{
	
	double a, b, c;
	
	A(double a, double b, double c) {
		
		this.a=a;
		this.b=b;
		this.c=c;	
	}

	@Override
	double getPercentage() {
		double percentage=(a+b+c)/3;
		return percentage;
	}
}

class B extends Marks{
	
	double a, b, c, d;
	
	B(double a, double b, double c, double d) {
		
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;		
	}

	@Override
	double getPercentage() {
		
		double percentage=(a+b+c+d)/4;
		return percentage;
	}
}

