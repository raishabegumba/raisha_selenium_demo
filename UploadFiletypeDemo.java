package com.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiletypeDemo {

	public static void main(String[] args) {

    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demo.guru99.com/test/upload/");
    
    //upload file of type="file"using send keys
    
    driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\raisha\\sample.jpg");
    driver.findElement(By.id("terms")).click();
    driver.findElement(By.id("submitbutton")).submit();
    }

}
