package seleniumassignement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class seleniumAssign02POM {
	WebDriver driver;
	
	public seleniumAssign02POM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
// Locators 
	@FindBy(xpath="//input[@placeholder='Username']") WebElement txt_username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txt_password;
	@FindBy(xpath ="//button[normalize-space()='Login']") WebElement btn_submit;
	
	
	public void setusername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void setpassword(String password) {
		txt_password.sendKeys(password);
	}
	public void login_button() {
		btn_submit.click();
	}
	
}

	

