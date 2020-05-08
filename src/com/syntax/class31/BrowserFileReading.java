package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class BrowserFileReading {
	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\Mahbub\\eclipse-workspace\\JavaBasics\\configs\\Browser.properties";
		FileInputStream browseInput=new FileInputStream(filePath);
		Properties property=new Properties();
		property.load(browseInput);
		
		property.load(browseInput);
		
		String str=property.getProperty("browser");
		String str1=property.getProperty("url");

		System.out.println(str);
		System.out.println(str1);
			
		System.out.println("--------retrieving keys using advanced loop-------");
		Set<Object>keys=property.keySet();
		for(Object k:keys) {
			System.out.println(k);
		}
		
	}
}
