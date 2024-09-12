package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocateByCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailId = driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
		emailId.sendKeys("test@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"][name=\"pass\"]"));
		password.sendKeys("12345");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[data-testid=\"royal_login_button\"]"));
		//loginBtn.click();
		//loginBtn.sendKeys(Keys.ENTER);
		loginBtn.submit();
	}

}
