package com.class27;

public abstract class ProgrammingLanguage {
	
	
	public void understandLogic() {
		System.out.println("To learn programming you must understand the logic");
	}
	
	public void knowSyntax() {
		System.out.println("To learn programming you must learn the syntax");
	}

	public abstract void writeCode();
	public abstract void debug();

}

class Java extends ProgrammingLanguage {

	@Override
	public void writeCode() {
		System.out.println("To write the Java code, you must use an Eclipse, Netbeans, or IntelliJ");
	}

	@Override
	public void debug() {
		System.out.println("In Java to debug, you use Eclipse");
	}
}

class CSharp extends ProgrammingLanguage {

	@Override
	public void writeCode() {
		System.out.println("To write the C# code, you must use Visual Studio");
	}

	@Override
	public void debug() {
		System.out.println("To debug in C#, you need to use a Visual Studio");	
	}
}

