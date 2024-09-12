package com.TestNGDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D13CreateStudentInfo {
	String fPath = "D:\\StarAgile\\Demos\\SA2404006\\SeleniumAutomationProject\\StudentsInfo.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void addStudentData() {
		row = sheet.createRow(0);
		cell = row.createCell(0);
		cell.setCellValue("Pooja");
		
		//row = sheet.createRow(0);
		cell = row.createCell(1);
		cell.setCellValue("CG");
		
		sheet.createRow(1).createCell(0).setCellValue("Ankit");
		sheet.getRow(1).createCell(1).setCellValue("Das");
		
	}

	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("StudentInfo");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
