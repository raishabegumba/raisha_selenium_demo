package com.seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxDemo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
             
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/automation-practice-form");
       
       List<WebElement> hobby= driver.findElements(By.xpath("//input[contains(@ id,\"hobbies-checkbox\")]"));
       Thread.sleep(10000);
       //  JavascriptExecutor js=(JavascriptExecutor)driver;
       // js.executeScript("arguments[].click()", hobby);
       //driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
      // wait.until(ExpectedConditions.visibilityOfAllElements(hobby));
      
       // WebElement hobby3= driver.findElement(By.xpath("//input[@id=\"hobbies-checkbox-2\"]"));
        for (WebElement h : hobby) {
			
        	if(!h.isSelected())
        	
        		h.click();
        	
        	else
        		h.click();
		}
        
       
      /*
        if(hobby1.isSelected()==false)
        	hobby1.click();
        else if(hobby2.isSelected()==false)
    	hobby2.click();
        else if(hobby3.isSelected()==false)
    	hobby3.click();
        else
        	System.out.println("All hobbies are selected");
        
     */
	}

}
