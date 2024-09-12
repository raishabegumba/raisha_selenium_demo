package com.TestNGDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D15ReadingFromExcel {
	String fPath = "D:\\StarAgile\\Demos\\SA2404006\\SeleniumAutomationProject\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test(enabled = false)
	public void readData() {
		row = sheet.getRow(0);
		cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		cell = row.getCell(1);
		System.out.println(cell.getStringCellValue());
		
		cell = row.getCell(2);
		System.out.println(cell.getStringCellValue());
		 
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(2).getStringCellValue());
	}
	
	@Test
	public void readAllData()
	{
		System.out.println("Reading all data");
		int totalRows = sheet.getPhysicalNumberOfRows();
		int totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i = 0; i < totalRows; i++)
		{
			row = sheet.getRow(i);
			for(int j = 0; j < totalCells; j++)
			{
				cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("LoginData");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
