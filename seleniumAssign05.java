package seleniumassignement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumAssign05 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://codenboxautomationlab.com/registration-form/");
	    driver.findElement(By.name("fname")).sendKeys("Raisha");
	    driver.findElement(By.cssSelector("input[name=\"lname\"]")).sendKeys("Begum");
	    driver.findElement(By.name("email")).sendKeys("raishabegum.ba@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"nf-field-20\"]")).sendKeys("8904058595");
	

		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("C:\\raisha\\selenium\\raisha_selenium_demos\\Screenshots\\registerForm.jpeg"));
		
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
	    
	    WebElement courseDrpDwn= driver.findElement(By.xpath("//*[@id=\"nf-field-22\"]"));
	    courseDrpDwn.click();
	    Select course= new Select(courseDrpDwn);
	    course.selectByIndex(0);
	 
		
	    WebElement monthDrpDwn= driver.findElement(By.xpath("//*[@id=\"nf-field-24\"]"));
	    Select month= new Select(monthDrpDwn);
	    month.selectByValue("august");
	    
	    WebElement socialMediaBtn= driver.findElement(By.xpath("//*[@id=\"nf-label-class-field-23-1\"]"));
	    socialMediaBtn.click();
	    driver.findElement(By.xpath("//*[@id=\"nf-field-15\"]")).click();
	    
	    Thread.sleep(5000);
	    file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(file, new File("C:\\raisha\\selenium\\raisha_selenium_demos\\Screenshots\\RegSuccess.jpeg"));
	    
	    String regSuccessMsg="Your registration is completed";
	    
	    if(driver.getPageSource().contains(regSuccessMsg))
	    {
	    	System.out.println("Registeration is success");
	    }
	    else
	    {
	    	System.out.println("Registeration is not success");
	    }
	    
	    
	    driver.close();

	}

}
