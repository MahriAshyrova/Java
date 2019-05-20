package com.classReview;

public class GameConsole {
	
	String controller;
	int numberofController;
	String powerSource;
	boolean cd;
	boolean ifTvNeeded;
	
	void ableToPlay() {
		System.out.println("I can play Games");
	}
	
	void readDisc() {
		System.out.println("I can read Disk");
	}

	boolean surfWeb() {
		return true;
	}
	
	
	boolean portable() {
		return false;
	}
	
	
	
	

}
