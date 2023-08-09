package capt.amazon.pageActions;

import org.openqa.selenium.support.PageFactory;
import capt.amazon.pageElements.AmazonHomePageLocators;
import capt.utilities.SetupDrivers;

public class AmazonHomePageActions {
	
	AmazonHomePageLocators AmazonHomePageLocatorsObj;
	
	public AmazonHomePageActions(){
		AmazonHomePageLocatorsObj = new AmazonHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonHomePageLocatorsObj);
		}
	
	public void searchItems(String items) throws Exception{
		AmazonHomePageLocatorsObj.txtbxSearch.sendKeys(items);
		Thread.sleep(3000);
		AmazonHomePageLocatorsObj.btnSubmit.click();
		Thread.sleep(3000);
	}
	
}
