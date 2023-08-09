package capt.amazon.stepDef;

import capt.amazon.pageActions.AmazonMusicActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonMusicSteps {

	AmazonMusicActions AmazonMusicActionsObj= new AmazonMusicActions();
	
	@When("^click on Music$")
	public void click_on_Music() throws Throwable {
		AmazonMusicActionsObj.clickMusic();
	}

	@When("^click on Open Web Player$")
	public void click_on_Open_Web_Player() throws Throwable {
		AmazonMusicActionsObj.clickOpenWebPlayer();
	}

	@When("^search for Ahasan Sakir$")
	public void search_for_Ahasan_Sakir() throws Throwable {
		AmazonMusicActionsObj.searchAhasanSakir();
	}

	@Then("^User should able to hear a song$")
	public void user_should_able_to_hear_a_song() throws Throwable {
		AmazonMusicActionsObj.userShould_HearSong();
	}
}
