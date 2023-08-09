package capt.amazon.pageActions;

import org.openqa.selenium.support.PageFactory;

import capt.amazon.pageElements.AmazonMusicLocators;
import capt.utilities.SetupDrivers;

public class AmazonMusicActions {

	AmazonMusicLocators AmazonMusicLocatorsObj;
	
	public AmazonMusicActions(){
		AmazonMusicLocatorsObj= new AmazonMusicLocators();
		PageFactory.initElements(SetupDrivers.driver, AmazonMusicLocatorsObj);
	}
	
	public void clickMusic() throws Exception{
		Thread.sleep(2000);
		AmazonMusicLocatorsObj.btnMusic.click();
		Thread.sleep(2000);
	}
	
	public void clickOpenWebPlayer() throws Exception {
		AmazonMusicLocatorsObj.btnWebPlayer.click();
		Thread.sleep(2000);
	}
	
	public void searchAhasanSakir() throws Exception{
		AmazonMusicLocatorsObj.cbxSearch.sendKeys("Ahasan Sakir");
		Thread.sleep(2000);
		AmazonMusicLocatorsObj.btnSearch.click();
		Thread.sleep(2000);
	}
	
	public void userShould_HearSong() throws Exception{
		AmazonMusicLocatorsObj.txtSong.click();
		Thread.sleep(30000);
	}
}
