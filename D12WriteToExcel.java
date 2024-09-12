package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D12WriteToExcel {
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	//HSSFWorkbook
	
	@Test
	public void writeTheData() {
		row = sheet.createRow(0);		//Creates 1st row
		cell = row.createCell(0);		//Creates 1st cell in 1st row
		
		cell.setCellValue("Archi");
	}

	@BeforeTest
	public void configureObjects() throws FileNotFoundException {
		file = new File("MyFirstExcel.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();			//Create a new Workbook
		sheet = wb.createSheet("MySheet");	//Create a new sheet in workbook
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos); 				//Write the data to Excel file
		wb.close();
		fos.close();
	}

}
