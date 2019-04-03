package com.class15;

public class Phone {
	
	boolean camera;
	String color, brand;
	int memory;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Phone ph1=new Phone();
	
	ph1.brand="Iphone";
	ph1.camera=true;
	ph1.color="Grey";
	ph1.memory=64;
	
	ph1.playMusic();
	ph1.makeCall();
	ph1.textMessage();
	
	System.out.println("---------------------------");
		
	Phone ph2=new Phone();
	
	ph2.brand="Android";
	ph2.camera=true;
	ph2.color="Black";
	ph2.memory=16;
	
	ph2.playMusic();
	ph2.makeCall();
	ph2.textMessage();

	System.out.println("---------------------------");
	
	Phone ph3=new Phone();
	
	ph3.brand="Nokia";
	ph3.camera=true;
	ph3.color="White";
	ph3.memory=8;
	
	ph3.playMusic();
	ph3.makeCall();
	ph3.textMessage();
	
	
	
	
	}
	
	void playMusic() {
		System.out.println("The phone can play music on "+brand);
	}

	void makeCall() {
		System.out.println("The phone can call on "+brand);
	}
	
	void textMessage() {
		System.out.println("The phone can text on "+brand);
	}
	
}
