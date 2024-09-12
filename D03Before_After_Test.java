package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_After_Test {
	WebDriver driver;
	
	@Test(priority = 2)
	public void openMeesho() {
		driver.get("https://www.meesho.com/");
		System.out.println("Title: " + driver.getTitle());
	}

	@Test(priority = 4)
	public void openMyntra() {
		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());
	}

	@Test(priority = 3)
	public void openAmazon() {
		driver.get("https://www.amazon.in/");
		System.out.println("Title: " + driver.getTitle());
	}

	@Test(priority = 1)
	public void openFirstCry() {
		driver.get("https://www.firstcry.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		System.out.println("After Test");
	}
	@BeforeTest
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
		System.out.println("Before Test");
	}
}
