package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05FirstCryAssignment {
	WebDriver driver;
	
	@Test(priority = 1, groups = "Fashion")
	public void clickOnBoysFashion() {
		driver.findElement(By.partialLinkText("BOY")).click();
	}
	@Test(priority = 2, groups = "Fashion")
	public void clickOnGirlsFashion() {
		driver.findElement(By.partialLinkText("GIRL")).click();
	}
	@Test(priority = 3, groups = "Accessories")
	public void clickOnToys() {
		driver.findElement(By.partialLinkText("TOY")).click();
	}
	@Test(priority = 4, groups = "Accessories")
	public void clickOnFootwear() {
		driver.findElement(By.partialLinkText("FOOT")).click();
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		driver.get("https://www.firstcry.com/");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest (alwaysRun = true)
	public void afterTest() {
		driver.close();
	}

}
