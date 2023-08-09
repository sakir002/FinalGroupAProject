@regression @smoke @GA-01 @E2E
Feature: Amazon Web Player

Description: User should able to play a song by using Amazon Web Player.
	
	Scenario: Open Amazon Web Player and play a song by Ahasan Sakir.
		Given Open Amazon Homepage 
		When click on Music
		And click on Open Web Player
		And search for Ahasan Sakir
		Then User should able to hear a song