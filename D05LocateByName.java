package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailId = driver.findElement(By.name("email"));
		//Please find the control on the page whose name is email & store the control 
		//in emailId object
		emailId.sendKeys("ankushvankore@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123456789");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

}
