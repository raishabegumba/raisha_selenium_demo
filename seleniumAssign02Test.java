package seleniumassignement;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class seleniumAssign02Test {
  WebDriver driver;
  seleniumAssign02POM obj;
	
	@Test
  public void adminLoginTest() {
		obj.setusername("admin");
		obj.setpassword("admin123");
		obj.login_button();
		
  }
  @AfterMethod
  public void afterMethod() {
	  
	  if(driver.getCurrentUrl().contains("dashboard"))
	  {
		  Assert.assertTrue(true, "Testcase Pass");
	  }
	  else
	  {
		  Assert.assertTrue(false, "Testcase Fail");
	  }
  }

  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      obj= new seleniumAssign02POM(driver);
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
