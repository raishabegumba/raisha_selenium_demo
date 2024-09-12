package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookDemo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("the title is :"+driver.getTitle());
		System.out.println("The current url is:"+ driver.getCurrentUrl());
		System.out.println("The welcome title is :"+ driver.findElement(By.className("_8eso")).getText());
        driver.findElement(By.name("email")).sendKeys("shamilutta@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("test@123");
        driver.findElement(By.cssSelector("button[class^=\"_42ft\"]")).submit();
        WebElement errorMsg= driver.findElement(By.cssSelector("div[class^=\"_9ay\"]"));
        System.out.println("ERROR MESSAGE IS:" +errorMsg.getText());
        


	}

}
