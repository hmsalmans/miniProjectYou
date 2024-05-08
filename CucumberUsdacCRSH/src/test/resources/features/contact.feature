#Author: Salman
#Keywords Summary :
	
Feature: Coantact form to send USDA your info and questions
 				 I want contact USDA and be able to send my question
  				So, they recive my info and question

  
  Scenario: Succefully submit form with all info
    Given I enter first name 
    And I last name
    And I type email address with valid format
    And I input phone number
    And I give some description
    And I type subject
    When I click submit button
    Then I check if form is submitted succesfully
     
    
   
   Scenario: Unsucceful to submit if invalid email format
   	Given I enter invalid format of email address
   	And I enter first name 
    And I last name
    And I input phone number
    And I give some description
    And I type subject
    When I click submit button
    Then I check I should get error message
   	

 
  
