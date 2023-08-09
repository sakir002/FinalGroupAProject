package capt.amazon.pageActions;

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
	
	
	
	
}
