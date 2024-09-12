package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D17HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);
		/*
		Now an object countries is holding the dropdown list
		And all the operation on this dropdown list can be performed only
		through this countries object
		*/ 
		//WebElement selectedCountry = countries.getFirstSelectedOption();
		//System.out.println("Selected Country: " + selectedCountry.getText());
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>countryList = countries.getOptions();
		System.out.println("Total Countries: " + countryList.size());
		
		//for(WebElement c : countryList)
			//System.out.println(c.getText());
		
		for(int i = 0; i < countryList.size(); i++)
		{
			System.out.println(i + ". " + countryList.get(i).getText());
		}
		
		//countries.selectByVisibleText("United Kingdom");
		//countries.selectByValue("221");
		countries.selectByIndex(218);
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		//driver.close();
		
	}

}
