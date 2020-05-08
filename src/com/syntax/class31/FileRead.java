package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileRead{

	public static void main (String[] args) throws IOException {
		String filePath="C:\\Users\\Mahbub\\eclipse-workspace\\JavaBasics\\configs\\Browser.properties";
		System.out.println(filePath);
		
		String userDirectory=System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		String username=System.getProperty("user.name");
		System.out.println(username);
		
		String os=System.getProperty("os.name");
		System.out.println(os);
		
		String filePath1=System.getProperty("user.dir")+"\\configs\\Browser.properties";
		FileInputStream fis=new FileInputStream(filePath1);
		System.out.println(fis);
		
		Properties property=new Properties();
		property.load(fis);
		
	}
}
