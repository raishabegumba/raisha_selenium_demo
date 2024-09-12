package seleniumassignement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * In rediff website under registration form select date of birth as "13-06-1990"
 * 
 */
public class seleniumAssign03 {

	public static void main(String[] args)  {
	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement dayDropDown= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select daySelector= new Select(dayDropDown);
		daySelector.selectByIndex(13);
		System.out.println("selected date is:" +daySelector.getFirstSelectedOption().getText());
		WebElement monthDropDown= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select monthSelector= new Select(monthDropDown);
		monthSelector.selectByValue("06");
		System.out.println("selected month is:" +monthSelector.getFirstSelectedOption().getText());
	
		WebElement yearDropDown=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select yearSelector= new Select(yearDropDown);
		yearSelector.selectByVisibleText("1990");
		System.out.println("selected year is:" +yearSelector.getFirstSelectedOption().getText());
	}

}
