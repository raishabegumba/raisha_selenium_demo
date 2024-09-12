package com.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeableDemo {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/resizable/");
		WebElement frame=(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		System.out.println(frame.getLocation().x +"   "+frame.getLocation().y);
	    driver.switchTo().frame(frame);	
		Actions act= new Actions(driver);
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		//System.out.println(ele.getLocation().x +"  "+ ele.getLocation().y);
		act.dragAndDropBy(ele,250, 250);
		
		
   

	}

}
