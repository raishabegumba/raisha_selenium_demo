package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D10KeywordDrivenFramework {
	String fPath = "D:\\StarAgile\\Demos\\SA2404006\\SeleniumAutomationProject\\src\\com\\TestNGDemos\\MyData.properties";
	File file;
	FileInputStream fis;
	Properties prop;
	WebDriver driver;
	
	@Test
	public void registration() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200)", "");
		driver.findElement(By.id(prop.getProperty("IDfirstName"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath(prop.getProperty("XPathLastName"))).sendKeys("Vankore");
		driver.findElement(By.cssSelector(prop.getProperty("CssEmail"))).sendKeys("ankush@gmail.com");
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath(prop.getProperty("XPathGenderMale"))));
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		//Now this prop object holding all the properties from MyData.properties file
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.close();
	}

}
