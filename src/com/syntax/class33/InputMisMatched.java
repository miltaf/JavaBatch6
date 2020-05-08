package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.channels.AlreadyBoundException;
import java.util.ArrayList;
import java.util.List;

public class InputMisMatched {
	public static void main(String[] args) {
		List<Object> exceptList=getList();
		for (Object ob: exceptList) {
			System.out.println(ob);
		}
		}
	public static List<Object> getList() {
		List<Object>exceptList=new ArrayList<>();
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}catch (ArithmeticException ae) {
			System.out.println("Catched ArithemeticExcpetions");
			exceptList.add(ae);
		}
		String str = null;
		try {
			System.out.println(str.length());
		}catch (NullPointerException npe) {
			System.out.println("Catched NullPointerException Exception");
			exceptList.add(npe);
		}
		String path="";
		try {
			FileInputStream fis=new FileInputStream(path);
		}catch(FileNotFoundException fne) {
			System.out.println("Catched FileNotFoundExcpetion Excpetion");
			exceptList.add(fne);
		}
		int[] array= {5, 7, 8, 9};
		try {
			System.out.println(array[6]);
		}catch(AlreadyBoundException e) {
			System.out.println("Catched ArrayIndexOutOfBoundException");
			exceptList.add(e);}
		return exceptList;
		}

	}
