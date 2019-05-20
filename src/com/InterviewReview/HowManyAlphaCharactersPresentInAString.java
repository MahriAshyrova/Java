package com.InterviewReview;

public class HowManyAlphaCharactersPresentInAString {

	public static void main(String[] args) {
		
		String given="wefeqf878979797fewfewrf879797efds&^&^*^*^";
		
		String replaced= given.replaceAll("[^A-Za-z]", "");
		
		System.out.println(replaced.length());
		
		

	}

}
