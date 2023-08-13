package capt.amazon.pageActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import capt.amazon.pageElements.AmazonHomePageLocators;
import capt.utilities.SetupDrivers;

public class AmazonHomePageActions {
	Actions Moveto = new Actions(SetupDrivers.driver);
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
	
	//Click on Best Seller 
	public void clickonBestSellers() {
		AmazonHomePageLocatorsObj.clickBestSeller.click();
	}
	
	//Click on Customer Service
	public void clickCustomerService() {
		AmazonHomePageLocatorsObj.clickCustomerService.click();
	}
	
	public void searchPhoneCase() throws Exception{
		AmazonHomePageLocatorsObj.txtbxSearch.sendKeys("iphone 12 case");
		Thread.sleep(3000);
		AmazonHomePageLocatorsObj.btnSubmit.click();
		Thread.sleep(3000);
	}
	
public void clickBars() throws Exception {
		AmazonHomePageLocatorsObj.clkMenu.click();
		Thread.sleep(3000);
	}
	public void clickBook() throws Exception{
		//AmazonHomePageLocatorsObj.cbBook.click();
//		Moveto.moveToElement(AmazonHomePageLocatorsObj.cbBook);
//		Moveto.perform();
//		Thread.sleep(2000);
//		AmazonHomePageLocatorsObj.cbBook.isEnabled();
//		AmazonHomePageLocatorsObj.cbBook.click();
//		Thread.sleep(3000);
		
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(AmazonHomePageLocatorsObj.cbBook).click().build().perform();
		Thread.sleep(3000);
	}
		
		
	
	public void clickAudible() throws Exception{
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(AmazonHomePageLocatorsObj.cbAudible).click().build().perform();
        Thread.sleep(3000);
	}

}
