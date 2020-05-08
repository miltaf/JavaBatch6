package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TourData {

	public static void main (String[] args) throws IOException {
		String filePath="C:\\Users\\Mahbub\\eclipse-workspace\\JavaBasics\\Testdata\\tourData.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook test=new XSSFWorkbook (fis);
		Sheet sheet=test.getSheet("Sheet1");
		
		int rows=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getLastCellNum();
		
		for (int r=0; r<rows; r++) {
			for (int c=0; c<col; c++) {
				String cellValue=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellValue+"   ");
			}
			System.out.println();
		}
	}
}
