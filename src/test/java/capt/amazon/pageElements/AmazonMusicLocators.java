package capt.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonMusicLocators {

	//practice 
	
			//click on music
			@FindBy(xpath="//a[text()= 'Music']")
			public WebElement btnMusic;
			
			//click on Open Web Player
			@FindBy(xpath="(//a[@class= 'nav-a'])[5]")
			public WebElement btnWebPlayer;
			
			//click on Searchbox
			@FindBy(xpath="//input[@placeholder= 'Search']")
			public WebElement cbxSearch;
			
			//click on search button
			@FindBy(xpath="//music-button[@id='navbarSearchInputButton']")
			public WebElement btnSearch;
			
			//click on first song
			@FindBy(xpath="//music-horizontal-item[@label='song']")
			public WebElement txtSong;
			
			
}
