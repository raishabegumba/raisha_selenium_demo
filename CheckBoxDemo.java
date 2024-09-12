package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://echoecho.com/");
	      driver.findElement(By.linkText("Tutorials")).click();
	      driver.findElement(By.xpath("//td[@class=\"table5\"]/ul/li/a[@href=\"html.htm\"]/span[@class=\"link\"]")).click();
	      driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[6]/table/tbody/tr/td/div[1]/table/tbody/tr[9]/td/a")).click();
	      driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[6]/table/tbody/tr/td/div[1]/table/tbody/tr[10]/td/a")).click();

	}

}
