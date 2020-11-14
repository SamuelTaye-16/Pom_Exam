package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Element Library
	
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"username\"]")WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//input[@id='password']")WebElement PASSWORD_FIELD_LOCATOR;
	@FindBy(how = How.NAME,using = "login")WebElement SIGNIN_BUTTON_LOCATOR;
	
	
	
	
	
	public void enterUserName(String username) {
		USERNAME_FIELD_LOCATOR.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		PASSWORD_FIELD_LOCATOR.sendKeys(password);
	}
	
	public void signinButton() throws InterruptedException {
		SIGNIN_BUTTON_LOCATOR.click();
		Thread.sleep(3000);	}
	

}
