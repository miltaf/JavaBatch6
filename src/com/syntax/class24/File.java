package com.syntax.class24;

public abstract class File {

	public void edit() {
		System.out.println("To edit a file, it should be open and you access the edit menu");
	}
	
	public void close() {
		System.out.println("To close a file, you need to simply press X button or press ctr+X");
	}
	
	public abstract void open();
	
}

class JavaFile extends File{
	@Override 
	public void open() {
		System.out.println("to open .java file, we need notepad++ or sublime text");
	}
}

class WordFile extends File{
	@Override
	public void open() {
		System.out.println("to open .doc file, we need Microsoft Word");
	}
}

class PDFFile extends File{
	@Override
	public void open() {
		System.out.println("to open a pdf file, we need Adobe Acrobate");
	}
}