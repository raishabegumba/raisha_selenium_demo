package com.seleniumpractice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.online.citibank.co.in/");
		//close all pop ups
		driver.findElement(By.xpath("//a[@class='newclose']")).click();
		driver.findElement(By.xpath("//a[@class='newclose2']")).click();
		driver.findElement(By.xpath("//a[@class='newclose3']")).click();

		System.out.println("The title of first window is:" +driver.getTitle());
		//click on link to open new window
		driver.findElement(By.xpath("//span[normalize-space()='Safe banking practices: RBI Kehta Hai']")).click();

		Set<String> windows=driver.getWindowHandles();

		Iterator<String> itr=windows.iterator();
		String win1=itr.next();
		String win2=itr.next();
		driver.switchTo().window(win2);
		System.out.println("The title of second window is:" +driver.getTitle());
		driver.findElement(By.xpath("//a[@class='blueBtn pullRight']")).click();
		
		//switch back to first window
		driver.switchTo().window(win1);
		driver.quit();

	}

}
