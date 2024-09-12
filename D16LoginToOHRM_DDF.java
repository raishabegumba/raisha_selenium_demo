package com.TestNGDemos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D16LoginToOHRM_DDF {
	//String fPath = "D:\\StarAgile\\Demos\\SA2404006\\SeleniumAutomationProject\\LoginData.xlsx";
	String fPath = System.getProperty("user.dir") + "\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	XSSFCellStyle style;
	XSSFFont font;
	
	int index = 1;
	
	WebDriver driver;
	
	@Test(dataProvider = "getLoginData")
	public void loinToOHRM(String un, String ps) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dash"));
	}
	@AfterMethod
	public void afterMethod() {
		row = sheet.getRow(index);
		cell = row.getCell(2);
		
		style = wb.createCellStyle();
		font = wb.createFont();
		
		if (driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("Login successful!!!");
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			
			font.setBold(true);
			font.setColor(HSSFColorPredefined.GREEN.getIndex());
			
			style.setFont(font);
			style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

			cell.setCellStyle(style);
			
			cell.setCellValue("Pass");
		}
		else
		{
			System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
			
			font.setItalic(true);
			font.setColor(HSSFColorPredefined.RED.getIndex());
			
			style.setFont(font);
			
			style.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			
			cell.setCellStyle(style);
			
			cell.setCellValue("Fail");
		}
		
		index++;
	}


	@DataProvider
	public Object[][] getLoginData() {
		int totalRows = sheet.getPhysicalNumberOfRows();
		String[][]loginData = new String[totalRows-1][2];
		
		for(int i = 0; i < totalRows-1; i++)
		{
			row = sheet.getRow(i+1);
			for(int j = 0; j < 2; j++)
			{
				cell = row.getCell(j);
				loginData[i][j] = cell.getStringCellValue();
			}
		}
		return loginData;
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		
		//Always configure FileOutputStream after configuring sheet
		fos = new FileOutputStream(file);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();
		
		driver.close();
	}

}
