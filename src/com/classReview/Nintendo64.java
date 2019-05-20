package com.classReview;

public class Nintendo64 extends GameConsole {
	
	
	
	public static void main(String [] args) {
		Nintendo64 nintendo = new Nintendo64();
		nintendo.controller="red & blue";
		nintendo.numberofController=4;
		nintendo.ifTvNeeded=true;
		nintendo.cd=false;
		nintendo.powerSource="outlet";
		
		// -------------Below are attributes---------------------//
//		System.out.println(nintendo.controller+" Controller color ");
//		System.out.println(nintendo.numberofController+ " number of controller");
//		System.out.println(nintendo.ifTvNeeded+" if tv is is needed");
//		System.out.println(nintendo.cd+ " is cd required");
//		System.out.println(nintendo.powerSource+" is power source needed");
//		
		// -------------Below are behaivors---------------------//
		//System.out.println(nintendo.portable()+" is game system portable");
		//System.out.println(nintendo.surfWeb()+" able to surf the web"); - too old to play on web
		//nintendo.readDisc(); nitendo is a casset player 
		nintendo.ableToPlay();
		System.out.println(nintendo.canPlayMarioGames()+" Can play Mario games");
			
		
	}
	
	boolean canPlayMarioGames () {
		return true;
	}
	
	
	
	
	
	

}
