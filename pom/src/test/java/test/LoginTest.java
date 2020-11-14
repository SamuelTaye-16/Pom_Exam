package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToLogin() throws InterruptedException {
		driver = BrowserFactory.init();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
		login.signinButton();

	}

}
