package com.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
     
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		String alertMsg=alertBox(driver,js);
		System.out.println("The alert message is displayed as:" +alertMsg );
		
		String timeAlertMsg=timeAlert(driver,js);
		System.out.println("The time alert message is displayed as:" +timeAlertMsg );
		
		String confirmAlertMsg=confirmalert(driver,js);
		System.out.println("The confirm alert message is displayed as:" +confirmAlertMsg );
		
		String promptAlertMsg=promptAlert(driver,js);
		System.out.println("The confirm alert message is displayed as:" +promptAlertMsg );
		//driver.close();
	}
	
	public static String alertBox(WebDriver driver,JavascriptExecutor js)
	{
		js.executeScript("arguments[0].click()", driver.findElement(By.id("alertButton")));
		Alert alt=driver.switchTo().alert();
		String Msg=alt.getText();
		alt.accept();
		return Msg;
	}

	public static String timeAlert(WebDriver driver,JavascriptExecutor js) throws InterruptedException
	{
		js.executeScript("arguments[0].click()", driver.findElement(By.id("timerAlertButton")));
		Thread.sleep(5000);
		Alert alt=driver.switchTo().alert();
		String timealertMsg=alt.getText();
		alt.accept();
		return timealertMsg;
	}
	
	public static String confirmalert(WebDriver driver,JavascriptExecutor js)
	{

		js.executeScript("arguments[0].click()", driver.findElement(By.id("confirmButton")));
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		String confirmalertMsg=driver.findElement(By.id("confirmResult")).getText();
		return confirmalertMsg;
	  
	}
	
	public static String promptAlert(WebDriver driver,JavascriptExecutor js) throws InterruptedException
	{
		js.executeAsyncScript("arguments[0].click()", driver.findElement(By.id("promtButton")));
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("MOHAMMED ZAHAN");
		alt.accept();
		String promptAlertMsg=driver.findElement(By.id("promptResult")).getText();
		Thread.sleep(5000);
		return promptAlertMsg;
	}

	
	
}
