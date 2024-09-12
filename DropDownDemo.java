package com.seleniumpractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		 WebElement dropList= driver.findElement(By.cssSelector("select[name*=\"country\"]"));
		//DROP DOWN WITH SELECT TAG
		 Select list= new Select(dropList);
		 List<WebElement> drpLst= list.getOptions();
		 String listName[] = new String[drpLst.size()];
		
		 for (int i=0;i<drpLst.size();i++)
		 { 
			 listName[i]= drpLst.get(i).getText();
			 //System.out.println(listName[i]);
					 
		}
		Arrays.sort(listName);
		System.out.println("drop down list value in ascending order "+ Arrays.toString(listName) );
		driver.close();
		
	}

}
