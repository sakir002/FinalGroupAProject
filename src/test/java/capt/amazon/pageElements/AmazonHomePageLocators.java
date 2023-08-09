package capt.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePageLocators {

	//Click on Search Amazon Text box
	@FindBy (xpath = "//input[@aria-label='Search Amazon']")
	public WebElement txtbxSearch;
	
	//click on search logo
	@FindBy (xpath="//input[@type='submit']")
	public WebElement btnSubmit;
	
	
}
