package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26HandlingMultipleWinows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("//*[@id=\"popup1\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"popup3\"]/div/a")).click();
		
		driver.findElement(By.xpath("//span[@style=\"display:table-cell\"]")).click();
		
		System.out.println("Title: " + driver.getTitle());
		
		Set<String>windows = driver.getWindowHandles();
		//System.out.println(windows);
		Iterator<String> itr = windows.iterator();		//Iterator is used to iterate over the Set
		String win1 = itr.next();			//Will return 1st element
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		System.out.println("Title: " + driver.getTitle());
		
		driver.findElement(By.linkText("Continue")).click();
		
		driver.switchTo().window(win1);
		
		driver.quit();
	}

}
