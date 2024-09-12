package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginErrorMsg {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("shamilutta@gmail.com");
	      driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("test@123");
	      driver.findElement(By.xpath("//button[@name=\"login\"]")).submit();
	      System.out.println("The login error message : "+driver.findElement(By.xpath("//DIV[@CLASS=\"_9ay7\"]")).getText());

	}

}
