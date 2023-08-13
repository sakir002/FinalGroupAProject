package capt.amazon.stepDef;

import capt.amazon.pageActions.AmazonHomePageActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class AmazonHomePageSteps {

	AmazonHomePageActions AmazonHomePageActionsObj = new AmazonHomePageActions();
		
	@Given("^Open Amazon Homepage$")
	public void open_Amazon_Homepage() throws Throwable {
		
	}

	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		AmazonHomePageActionsObj.searchItems(items);
	}

		//Click on Best Seller 
		@When("^Click on Best Sellers$")
		public void click_on_Best_Sellers() throws Throwable {
			AmazonHomePageActionsObj.clickonBestSellers();
		}
		
		//click on Amazon Customer Service 
		@When("^Click on Customer Service$")
		public void click_on_Customer_Service() throws Throwable {
			AmazonHomePageActionsObj.clickCustomerService();
		}
		
	//
		
		@When("^search for iphone (\\d+) case$")
		public void search_for_iphone_case(int arg1) throws Throwable {
			AmazonHomePageActionsObj.searchPhoneCase();
		
		}		
		
		@When("^click on All bars$")
		public void click_on_All_bars() throws Throwable {
			AmazonHomePageActionsObj.clickBars();
		}

		@When("^click on books through shop by department$")
		public void click_on_books_through_shop_by_department() throws Throwable {
			AmazonHomePageActionsObj.clickBook();
		}

		@When("^click on Audible books &originals$")
		public void click_on_Audible_books_originals() throws Throwable {
			AmazonHomePageActionsObj.clickAudible();
		}
}