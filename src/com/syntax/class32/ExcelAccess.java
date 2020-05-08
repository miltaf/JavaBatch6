package com.syntax.class32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAccess {

	public static void main (String[] args) throws IOException {
		String filePath="C:\\Users\\Mahbub\\eclipse-workspace\\JavaBasics\\Testdata\\test.xlsx";
		
		FileInputStream fis=new FileInputStream (filePath);
		//accessing workbook
		Workbook wbook=new XSSFWorkbook(fis);
		
		//accessing sheet
		Sheet sheet=wbook.getSheet("Sheet1");
		
		//accessing the row
		Row row=sheet.getRow(0);
		
		//accessing cell
		Cell cell=row.getCell(1);
		
		//get value from cell
		String r1c2=cell.toString();
		System.out.println(r1c2);
		
		//how to get Arlington
		Row row1=sheet.getRow(2);
		Cell r3c3=row1.getCell(2);
		String cellValue=r3c3.toString();
		System.out.println(cellValue);
		
		//access 22313 zip code in xlxs
		cellValue=sheet.getRow(1).getCell(4).toString();
		System.out.println(cellValue);
		
		//to retrieve value based on type
		double cellv=sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println((int)cellv); //use int to get rid of .0 or double value
		
	}
}
