package com.class27;

//Create a class File that will have the following behaviors: open, edit, close.
//Edit and close are implemented method while open is an abstract. 
//Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour:
//Exmaple: to open .java file we need notepad++ or sublime tex, to open .doc file we need Microsoft word to be installed

public abstract class File {
	
	public abstract void open();
	
	public void edit() {
		System.out.println("File can be edited");
	}
	
	public void close() {
		System.out.println("File can be closed");
	}
}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("To open the java file we need a notepadd++ or a Sublime text");	
	}
}

class WordFile extends File{

	@Override
	public void open() {
		System.out.println("To open .doc file we need Microsoft word to be installed");	
	}
}

class PDFFile extends File {

	@Override
	public void open() {
		System.out.println("To open .pdf file we need pdf to be installed");	
	}
}