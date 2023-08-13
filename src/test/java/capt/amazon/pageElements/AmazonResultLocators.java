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
		
		//verify Best Seller 	
		@FindBy(xpath="//span[text()= 'Amazon Best Sellers']")
		public WebElement txtBestSeller;

		//verify Customer Service
		@FindBy(xpath="(//a[text()='Customer Service'])[2]")
		public WebElement txtCustomerService;
		
		
		
		
		//Validate Laptop Items
				@FindBy(xpath="//span[contains(text(),'SPIDERCASE Designed for')]")
				public WebElement linkCase;
				
				@FindBy(xpath="//input[@id='add-to-cart-button']")
				public WebElement btnAddcart;
	
				@FindBy(xpath="//body/div[@id='a-page']/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]")
				public WebElement verifyBooks;
				
				
				
				}

