package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocateByClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//WebElement searchBox = driver.findElement(By.className("gLFyf"));
		//searchBox.sendKeys("pagalworld");
		//searchBox.sendKeys(Keys.RETURN);		//Hit enter
		//searchBox.sendKeys(Keys.CONTROL + "A");
		
		//WebElement searchBtn = driver.findElement(By.name("btnK"));
		//searchBtn.click();
		driver.findElement(By.className("gLFyf")).sendKeys("Ankush Vankore");
		driver.findElement(By.cssSelector("textarea[aria-label=\"Search\"]")).sendKeys(Keys.CONTROL + "A");
		//driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		//driver.findElement(By.className("gLFyf")).sendKeys(Keys.RETURN);
	}

}
