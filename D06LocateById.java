package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateById {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement mailId = driver.findElement(By.id("email"));
		mailId.sendKeys("test@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("test");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
		
	}

}
