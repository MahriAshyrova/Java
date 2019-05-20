package com.class27;

public abstract class Phone { // abstract class 
	
	public void makeCall() {
		System.out.println("Phones can make a call");
	}
	
	public void sendText() {
		System.out.println("Phones can send text");
	}
	
	public abstract void unlockPhone();
	
	public abstract void viewPictures();	
}
class iPhone extends Phone { // concrete class - is a class that is inherited from an absract class 
	 	// or implemented by interface and providing implementation of all unimplemented/abstarct classes 

	@Override
	public void unlockPhone() {
		System.out.println("To unlock iPhone, you can use FaceId or FingerPrint");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures on iPhone, you can go to Photos");
		
	}
}
class Samsung extends Phone{

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Samsung, you need to enter password");
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pictures on Samsung, you can go to Gallery");
		
	}
	
}
 
 
 
 
 
 