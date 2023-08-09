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
}
