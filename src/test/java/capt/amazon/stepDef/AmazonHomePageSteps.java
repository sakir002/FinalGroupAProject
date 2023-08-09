package capt.amazon.stepDef;

import capt.amazon.pageActions.AmazonHomePageActions;
import cucumber.api.java.en.Given;

public class AmazonHomePageSteps {

	AmazonHomePageActions AmazonHomePageActionsObj = new AmazonHomePageActions();
		
	@Given("^Open Amazon Homepage$")
	public void open_Amazon_Homepage() throws Throwable {
		
	}

	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		AmazonHomePageActionsObj.searchItems(items);
	}

		
	
		
			
}