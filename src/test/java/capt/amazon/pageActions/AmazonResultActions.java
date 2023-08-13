package capt.amazon.pageActions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import capt.amazon.pageElements.AmazonResultLocators;
import capt.utilities.SetupDrivers;

public class AmazonResultActions {

	AmazonResultLocators AmazonResultLocatorsObj;
	
	public AmazonResultActions(){
		AmazonResultLocatorsObj= new AmazonResultLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonResultLocatorsObj);
	}
	
	public void filterBrand(String brand){
		if(brand.equals("Apple")){
			AmazonResultLocatorsObj.cbxApple.click();
		} else if (brand.equals("Sony")){
			AmazonResultLocatorsObj.cbxSony.click();
		} else if (brand.equals("Dell")){
			AmazonResultLocatorsObj.cbxDell.click();
		} else {
			System.out.println("Brand not found");
		}
	}
	
	public void verifyBrandItems(String brand){
		if(brand.equals("Apple")){
			AmazonResultLocatorsObj.txtPhone.isDisplayed();
		} else if (brand.equals("Sony")){
			AmazonResultLocatorsObj.txtCamera.isDisplayed();
		} else if (brand.equals("Dell")){
			AmazonResultLocatorsObj.txtLaptop.isDisplayed();
		} else {
			System.out.println("Brand not found");
		}
	}
	
	//Best Seller will appear
	public void verifyBestSeller() throws Exception	{
		AmazonResultLocatorsObj.txtBestSeller.isDisplayed();
	Thread.sleep(5000);
	}

	//Customer Service page will appear
	public void verifyCustomerSercvice() throws Exception {
		AmazonResultLocatorsObj.txtCustomerService.isDisplayed();
		Thread.sleep(3000);
		
	}
	public void firstCase() throws Exception{
		AmazonResultLocatorsObj.linkCase.click();
		Thread.sleep(3000);
	}
	
	public void addcart() throws Exception{
		AmazonResultLocatorsObj.btnAddcart.click();
		Thread.sleep(3000);
	}
	
	public void verifyAllBooks() throws Exception{
		AmazonResultLocatorsObj.verifyBooks.isDisplayed();
		Thread.sleep(3000);
	}
}
