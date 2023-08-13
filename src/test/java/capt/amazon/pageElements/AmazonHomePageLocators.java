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
	
	//Click Best Seller	
	@FindBy(xpath="(//a[text()= 'Best Sellers'])[1]")
	public WebElement clickBestSeller;

	//Click Customer Service
	@FindBy(xpath="//a[text()='Customer Service']")
	public WebElement clickCustomerService;

	@FindBy(xpath="//i[@class='hm-icon nav-sprite']")
	public WebElement clkMenu;
	
	@FindBy(xpath="//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[14]/li[9]/a[1]")
	public WebElement cbBook;
	
	@FindBy(xpath="(//a[contains(text(), 'Audible Books')])[1]")
	public WebElement cbAudible;
	
}
