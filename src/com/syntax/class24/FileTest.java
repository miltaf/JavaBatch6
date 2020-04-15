package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {

		File java=new JavaFile();
		java.open();
		java.close();
		java.edit();
		
		System.out.println("----------------------------------");
		
		File word=new WordFile();
		word.open();
		word.close();
		word.edit();
		
		System.out.println("------------------------------------");
		
		File pdf=new PDFFile();
		pdf.open();
		pdf.close();
		pdf.edit();
		
		

	}

}
