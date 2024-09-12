package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/droppable/");
	    
	    driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
	    
	    WebElement src=driver.findElement(By.xpath(" //div[@id='draggable']"));
	    WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
	    
	    Actions act= new Actions(driver);

	    act.dragAndDrop(src, dest).perform();
	}

}
