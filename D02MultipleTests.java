package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTests {

	@Test(priority = 2)
	public void openMeesho() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.meesho.com/");

		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}

	@Test(priority = 4)
	public void openMyntra() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.myntra.com/");

		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}

	@Test(priority = 3)
	public void openAmazon() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");

		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}

	@Test(priority = 1)
	public void openFirstCry() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.firstcry.com/");

		System.out.println("Title: " + driver.getTitle());

		driver.close();
	}
}
