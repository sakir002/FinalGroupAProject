@regression @smoke @GA-01 @E2E
Feature: Amazon add cart


	Background: 
		Given Open Amazon Homepage
	
	Scenario:  Amazon add cart
		
		When search for iphone 12 case
		And click on first phone case
		Then add on cart 