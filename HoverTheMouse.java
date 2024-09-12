package com.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverTheMouse {

	public static void main(String[] args) {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.firstcry.com/");
			Actions act= new Actions(driver);
			act.moveToElement(driver.findElement(By.partialLinkText("BOY"))).perform();
			WebElement element=driver.findElement(By.partialLinkText("Sibling"));
			act.moveToElement(element).doubleClick().perform();
	}

}
