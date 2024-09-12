package seleniumassignement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Write a WebDriver script to navigate to a website and 
 * click on a specific link
 *  
 */

public class seleniumAssign01 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement createAccountLink= driver.findElement(By.partialLinkText("Create a"));
		createAccountLink.click();
		
		if(driver.getCurrentUrl().contains("register"))
		{
			System.out.println("click at create account link is pass");
		}
		else
		{
			System.out.println("click at create account link is fail");
		}
		
		

	}

}
