package capt.amazon.stepDef;

import capt.amazon.pageActions.AmazonResultActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonResultSteps {

	AmazonResultActions AmazonResultActionsObj= new AmazonResultActions();
	
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		AmazonResultActionsObj.filterBrand(brand);
	}

	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
		AmazonResultActionsObj.verifyBrandItems(brand);
	}
	
	//Verify Best Seller
		@Then("^User should be able to see all Best Sellers items$")
		public void user_should_be_able_to_see_all_Best_Sellers_items() throws Throwable {
			AmazonResultActionsObj.verifyBestSeller();
	}
		@Then("^User should be able to see Customer Service page$")
		public void user_should_be_able_to_see_Customer_Service_page() throws Throwable {
			AmazonResultActionsObj.verifyCustomerSercvice();
		}
		
		@When("^click on first phone case$")
		public void click_on_first_phone_case() throws Throwable {
			AmazonResultActionsObj.firstCase();
		}

		@Then("^add on cart$")
		public void add_on_cart() throws Throwable {
			AmazonResultActionsObj.addcart();
}
		@Then("^User should able to see Audible books &originals$")
		public void user_should_able_to_see_Audible_books_originals() throws Throwable {
			AmazonResultActionsObj.verifyAllBooks();
		}
		
		
}
