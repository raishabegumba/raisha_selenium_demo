package com.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {

      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com");
      String title=driver.getTitle();
      if(title.equals("Google"))
      
    	  System.out.println(" the title is valid");
      
      else
      
    	  System.out.println("The title is not valid");
      
      System.out.println(driver.getCurrentUrl());// to verify 
     // System.out.println(driver.getPageSource());
      driver.close();

	}

}
