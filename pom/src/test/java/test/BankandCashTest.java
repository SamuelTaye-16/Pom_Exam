package test;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;

import page.DashBoardPage;
import page.BankandCashPage;
import page.LoginPage;
	import util.BrowserFactory;

	public class BankandCashTest {

		WebDriver driver;

		@Test
		public void validUserShouldBeAbleToLogin() throws InterruptedException {
			driver = BrowserFactory.init();

			LoginPage login = PageFactory.initElements(driver, LoginPage.class);

			login.enterUserName("demo@techfios.com");
			login.enterPassword("abc123");
			login.signinButton();
			
			DashBoardPage accountpage =PageFactory.initElements(driver, DashBoardPage.class);
			accountpage.validateAccountBoardPage();
			
			BankandCashPage bankandcash = PageFactory.initElements(driver, BankandCashPage.class);
			bankandcash.bankAndCash();
			bankandcash.newAccountButton();
			bankandcash.accountTitleField("Saving Account");
			bankandcash.descriptionField("Joint");
			bankandcash.intialField("10000");
			bankandcash.accountNumber("12308011101");
			bankandcash.contactPerson("Elsabet Samuel");
			bankandcash.phoneNumber("1110000876");
			bankandcash.internetBanking("https://www.capitalone.com/");
			bankandcash.submit();

		}

}
