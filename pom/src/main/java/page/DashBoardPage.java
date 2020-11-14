package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashBoardPage {
	
	WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")WebElement DashBoard_ELEMENT_LOCATOR;
	
	
	
public void validateAccountBoardPage() {
	Assert.assertEquals(DashBoard_ELEMENT_LOCATOR.getText(), "Dashboard", "Wrong Page!");
}

}
