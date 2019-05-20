package com.class27;

public class ProgrammingLanguageTest {

	public static void main(String[] args) {
		
		
		ProgrammingLanguage pl1=new Java();
		pl1.knowSyntax();
		pl1.understandLogic();
		pl1.debug();
		pl1.writeCode();
		
		

		ProgrammingLanguage pl2=new CSharp();
		pl2.knowSyntax();
		pl2.understandLogic();
		pl2.debug();
		pl2.writeCode();	
	}

}
