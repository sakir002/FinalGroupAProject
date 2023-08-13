package capt.amazon.stepDef;

import capt.amazon.pageActions.AmazonProductActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonProductSteps {

	AmazonProductActions ProductAction = new AmazonProductActions();
	
	@When("^Navigate HamburgerMenu All$")
	public void navigate_HamburgerMenu_All() throws Throwable {
		ProductAction.navigateAllMenu();
	}

	@When("^Go to Computers under the Shop By Department Category$")
	public void go_to_Computers_under_the_Shop_By_Department_Category() throws Throwable {
		ProductAction.shopByDepartmentComputers();
	}

	@When("^Select Data Storage Button$")
	public void select_Data_Storage_Button() throws Throwable {
		ProductAction.dataStorageButton();
	}

	@Then("^User can able to see all Data Storage Items$")
	public void user_can_able_to_see_all_Data_Storage_Items() throws Throwable {
		ProductAction.verifyAllDataStorage();
	}
}
