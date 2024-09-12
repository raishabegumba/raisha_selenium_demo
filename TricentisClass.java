package com.TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TricentisClass {
	WebDriver driver;
	
	@FindBy(partialLinkText = "Auto") WebElement autoLink;
	@FindBy(partialLinkText = "Truck") WebElement truckLink;
	@FindBy(xpath = "//input[@id='dateofmanufacture']") WebElement dtm;
	
	public TricentisClass(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}

	/*public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://sampleapp.tricentis.com/101/index.php#");

		TricentisClass t1 = new TricentisClass();
		t1.clickAutomobile();
		t1.selectMake("Audi");
		t1.setEnginePerformance("1000");
		t1.setDateOfManufacture("07/31/2024");
		t1.selectNoOfSeats("3");
		
	}*/

	public void clickAutomobile() {
		//driver.findElement(By.partialLinkText("Auto")).click();
		autoLink.click();
	}
	public void clickTruck() {
		//driver.findElement(By.partialLinkText("Truck")).click();
		truckLink.click();
	}
	public void selectMake(String make)
	{
		Select vmake = new Select(driver.findElement(By.id("make")));
		vmake.selectByVisibleText(make);
	}
	public void setEnginePerformance(String ep)
	{
		driver.findElement(By.id("engineperformance")).sendKeys(ep);
	}
	public void setDateOfManufacture(String dt)
	{
		//driver.findElement(By.id("dateofmanufacture")).sendKeys(dt);
		dtm.sendKeys(dt);
	}
	public void selectNoOfSeats(String seats)
	{
		new Select(driver.findElement(By.id("numberofseats"))).selectByVisibleText(seats);
	}
	

}
