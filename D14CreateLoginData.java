package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
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

public class D14CreateLoginData {
	String fPath = "D:\\StarAgile\\Demos\\SA2404006\\SeleniumAutomationProject\\LoginData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 0;

	@Test(dataProvider = "getLoginData")
	public void writeData(String un, String ps, String rs) {
		sheet.createRow(index).createCell(0).setCellValue(un);
		sheet.getRow(index).createCell(1).setCellValue(ps);
		sheet.getRow(index).createCell(2).setCellValue(rs);;
		
		index++;
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "User Name", "Password", "Result" },
			new Object[] { "admin", "admin123", "Not Run" },
			new Object[] { "ramgiri", "ramgiri123", "Not Run" },
			new Object[] { "anupam", "anupam123", "Not Run" },
			new Object[] { "admin", "admin123", "Not Run" },
		};
	}
	@BeforeTest
	public void beforeTest() throws FileNotFoundException {
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("LoginData");
		
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
