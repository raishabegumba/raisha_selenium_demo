package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D11PageObjectModel {
	WebDriver driver;
	TricentisClass t1;
	
	@Test
	public void automobileTest() {
		t1.clickAutomobile();
		t1.selectMake("Audi");
		t1.setEnginePerformance("1500");
		t1.setDateOfManufacture("08/01/2024");
		t1.selectNoOfSeats("1");
	}
	@Test
	public void truckTest() {
		t1.clickTruck();
		t1.selectMake("Ford");
		t1.setEnginePerformance("1500");
		t1.setDateOfManufacture("08/01/2024");
		t1.selectNoOfSeats("3");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sampleapp.tricentis.com/101/index.php#");
		
		t1 = new TricentisClass(driver);
	}

	@AfterTest
	public void afterTest() {
	}

}
