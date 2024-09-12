package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13LocateByXPath_Relative {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.xpath("//div[@id=\"form\"]/div[1]/input[1]")).sendKeys("student");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		
		//WebElement errMsg = driver.findElement(By.xpath("//*[@id=\"error\"]"));
		//String msg = errMsg.getText();
		
		//System.out.println(msg);
		
		//System.out.println("Error Message: " + driver.findElement(By.xpath("//*[@id=\"error\"]")).getText());
		
		String url = driver.getCurrentUrl();
		
		driver.findElement(By.partialLinkText("Log")).click();
		
		if(url.contains("/logged-in-successfully"))
			System.out.println("Login Succesful\nTest case PASS");
		else
			System.out.println("Login Failed\nTest case Fail");
		
		driver.close();
	}

}
