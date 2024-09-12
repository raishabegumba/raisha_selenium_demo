package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04ReadURL {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		
		driver.get("https://www.selenium.dev/");
		
		String url = driver.getCurrentUrl();
		System.out.println("URL: " + url);
		
		driver.close();
		//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		//https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
	}

}
