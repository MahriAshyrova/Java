package com.class26;

public class PhoneTest {

	public static void main(String[] args) {
		
		System.out.println("------------Object of a parent class---------------");
		Phone phone = new Phone();
		phone.hasCamera();
		phone.makeCall();
		
		System.out.println("------------Object of an Iphone class---------------");
		iPhone iphone = new iPhone();
		iphone.hasCamera();
		iphone.makeCall();
		
		System.out.println("------------Object of a Samsung class---------------");
		Samsung samsung = new Samsung();
		samsung.makeCall();
		samsung.hasCamera();
		
		System.out.println("------------Object of a Nokia class---------------");
		Nokia nokia = new Nokia();
		nokia.makeCall();
		nokia.hasCamera();
		
		
		System.out.println("------------Object of an Iphone class referring to the Parent---------------");
		Phone p= new iPhone();
		p.makeCall();
		p.hasCamera();
		
		
		System.out.println("------------Object of an Nokia class referring to the Parent---------------");
		Phone p1= new Nokia();
		p1.makeCall();
		p1.hasCamera();
		// p1.cannotBreak(); - compile time error, method is undefined 
		
		
		// creating a variable of a ParentType 
		Phone parentPhone;

		//assigning iPhone object 
		parentPhone=new iPhone();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		
		//assigning Samsung object 
		parentPhone=new Samsung();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		
		//assigning Nokia object 
		parentPhone=new Nokia();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		
		
		
		
		
		
		
		
		
	}

}
