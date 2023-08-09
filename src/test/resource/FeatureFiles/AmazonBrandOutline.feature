@regression @smoke @GA-01 @E2E
Feature: Amazon Brand Outline

Description: User should able to filter the items by Brand

	Background: 
		Given Open Amazon Homepage
	
	Scenario Outline: Filter items by Brand
		Given Search for "<Items>"
		When Filter by "<Brand>"
		Then Item list should have products of "<Brand>"
	
	Examples:
		|Items		|Brand		|
		|Phone		|Apple		|
		|Camera		|Sony		|
		|Laptop		|Dell		|