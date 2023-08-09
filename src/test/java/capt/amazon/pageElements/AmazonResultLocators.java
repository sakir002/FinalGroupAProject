package capt.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonResultLocators {

		//Validate Phone Items
		@FindBy(xpath="(//span[contains(text(),'Phone')])[1]")
		public WebElement txtPhone;
	
		//Validate Camera Items
		@FindBy(xpath="(//span[contains(text(),'Camera')])[1]")
		public WebElement txtCamera;
		
		//Validate Laptop Items
		@FindBy(xpath="(//span[contains(text(),'Laptop')])[1]")
		public WebElement txtLaptop;
		
		//Validate Apple Items
		@FindBy(xpath="//span[text()= 'Apple']")
		public WebElement cbxApple;
		
		//Validate Sony Items
		@FindBy(xpath="//span[text()= 'Sony']")
		public WebElement cbxSony;
		
		//Validate Dell Items
		@FindBy(xpath="//span[text()= 'Dell']")
		public WebElement cbxDell;
	
}
