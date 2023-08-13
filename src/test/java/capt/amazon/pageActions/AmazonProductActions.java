package capt.amazon.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import capt.amazon.pageElements.AmazonProductLocators;
import capt.utilities.SetupDrivers;

public class AmazonProductActions {
	WebDriverWait ExplWt = new WebDriverWait(SetupDrivers.driver, 15);
	Actions Moveto = new Actions(SetupDrivers.driver);
	
	AmazonProductLocators ProductLocators;
	
	public AmazonProductActions(){
		ProductLocators = new AmazonProductLocators();
		PageFactory.initElements(SetupDrivers.driver, ProductLocators);
	}
	
	public void homePage(){
		SetupDrivers.driver.get("https://www.amazon.com");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void navigateAllMenu() throws Exception{
		ProductLocators.hmAllMenuBtn.click();
		Thread.sleep(2000);
		
	}
	
	public void shopByDepartmentComputers() throws Exception{
		ExplWt.until(ExpectedConditions.elementToBeClickable(ProductLocators.computersMenuBtn));
		Moveto.moveToElement(ProductLocators.computersMenuBtn);
		Moveto.perform();
		Thread.sleep(2000);
		ProductLocators.computersMenuBtn.isEnabled();
		ProductLocators.computersMenuBtn.click();
		Thread.sleep(3000);
	}
	
	public void dataStorageButton() throws Exception{
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(ProductLocators.storageMenuBtn).click().build().perform();
	}
	
	/*
	public void dataStorageButton() throws Exception{
		ExplWt.until(ExpectedConditions.elementToBeClickable(ProductLocators.storageMenuBtn));
		Moveto.moveToElement(ProductLocators.storageMenuBtn);
		Moveto.perform();
		Thread.sleep(3000);
		ProductLocators.storageMenuBtn.isEnabled();
		Thread.sleep(3000);
		ProductLocators.storageMenuBtn.click();
	}
	*/
	
	public void verifyAllDataStorage() throws Exception{
		ExplWt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select/option[text()='Data Storage']")));
		ProductLocators.verifyDataStorage.isDisplayed();
		Thread.sleep(3000);
	}
}