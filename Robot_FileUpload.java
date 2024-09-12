package com.seleniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {

				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://sampleapp.tricentis.com/101/index.php#");
				driver.findElement(By.partialLinkText("Auto")).click();
				driver.findElement(By.partialLinkText("Enter Insurant Data")).click();
				driver.findElement(By.id("open")).click();
				Thread.sleep(1000);
				fileUpload();
				

	}
	
	public static void fileUpload() throws AWTException, InterruptedException
	{
		
		Robot rt= new Robot();
		for (int i = 0; i<=7; i++) 
		{
		
		 Thread.sleep(2000);	
		 rt.keyPress(KeyEvent.VK_TAB);
		}
		
		for (int i = 0; i<=4; i++) 
		{
			 Thread.sleep(2000);	
			 rt.keyPress(KeyEvent.VK_DOWN);
		}
		
		Thread.sleep(1000);
		rt.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rt.keyPress(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);		
		for (int i = 0; i<=6; i++) 
		{
			 Thread.sleep(2000);	
			 rt.keyPress(KeyEvent.VK_DOWN);
		}
		
		Thread.sleep(1000);
		rt.keyPress(KeyEvent.VK_ENTER);
	}

}
