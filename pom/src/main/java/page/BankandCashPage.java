package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankandCashPage {
	
	
	//Element Library
	
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")WebElement BANK_AND_CASH_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")WebElement NEW_ACCOUNT_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//*[@id=\"account\"]")WebElement ACCOUNT_TITLE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//*[@id=\"description\"]")WebElement DESCRIPTION_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//*[@id=\"balance\"]")WebElement INTIAL_BALANCE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//*[@id=\"account_number\"]")WebElement ACCOUNT_NUMBER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//*[@id=\"contact_person\"]")WebElement CONTACT_PERSON_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//*[@id=\"contact_phone\"]")WebElement PHONE_NUMBER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//*[@id=\"ib_url\"]")WebElement INTERNET_BANKING_URL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH,using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")WebElement SUBMIT_BUTTON_FIELD_LOCATOR;
	
	
	
	
	public void bankAndCash() {
		BANK_AND_CASH_FIELD_LOCATOR.click();
	}
	
	public void newAccountButton() throws InterruptedException {
		NEW_ACCOUNT_FIELD_LOCATOR.click();	
		Thread.sleep(3000);
	}
	
	public void accountTitleField(String title) {
		ACCOUNT_TITLE_FIELD_LOCATOR.sendKeys(title);
	}
	
	public void descriptionField(String type) {
		DESCRIPTION_FIELD_LOCATOR.sendKeys(type);
	}
	
	public void intialField(String amount) {
		INTIAL_BALANCE_FIELD_LOCATOR.sendKeys(amount);
	}

	public void accountNumber(String accnumber) {
		ACCOUNT_NUMBER_FIELD_LOCATOR.sendKeys(accnumber);
	}

	public void contactPerson(String name) {
		CONTACT_PERSON_FIELD_LOCATOR.sendKeys(name);
	}
	
	public void phoneNumber(String phoNumber) {
		PHONE_NUMBER_FIELD_LOCATOR.sendKeys(phoNumber);
	}
	
	public void internetBanking(String internet) {
		INTERNET_BANKING_URL_FIELD_LOCATOR.sendKeys(internet);
	}
	
	public void submit() {
		SUBMIT_BUTTON_FIELD_LOCATOR.click();
	}



}
