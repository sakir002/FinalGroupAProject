package capt.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonProductLocators {

		//Home All Menu
		@FindBy(xpath="(//span[text()='All'])[2]")
		public WebElement hmAllMenuBtn;
		
		//All Menu Shop by Department Verify
		@FindBy(xpath="//div[text()='shop by department']")
		public WebElement menuListVerify;
		
		//See All Menu
		@FindBy(xpath="((//a/div[text()='see all'])[1]")
		public WebElement seeAllList;
			
		//Computers
		@FindBy(xpath="(//a/div[text()='Computers'])[1]")
		public WebElement computersMenuBtn;
		
		//Drives & Storage Menu
		@FindBy(xpath="//a[text()='Data Storage']")
		public WebElement storageMenuBtn;
		
		@FindBy(xpath="//a[normalize-space()='Data Storage']")
		public WebElement storageMenuBtn2;
		
		//Verify Data Storage
		@FindBy(xpath="//select/option[text()='Data Storage']")
		public WebElement verifyDataStorage;
}
