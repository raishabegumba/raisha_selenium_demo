package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D16HandlingRadioButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement genderF = driver.findElement(By.cssSelector("input[name^=\"gender\"][value=\"f\"]"));
		
		System.out.println("Before Clicking");
		System.out.println("Female Radio Button: Selected: " + genderF.isSelected());
		System.out.println("Female Radio Button: Visible : " + genderF.isDisplayed());
		System.out.println("Female Radio Button: Enabled : " + genderF.isEnabled());
		
		genderF.click();
		
		System.out.println("\nAfter Clicking");
		System.out.println("Female Radio Button: Selected: " + genderF.isSelected());
		System.out.println("Female Radio Button: Visible : " + genderF.isDisplayed());
		System.out.println("Female Radio Button: Enabled : " + genderF.isEnabled());
		
	}

}
