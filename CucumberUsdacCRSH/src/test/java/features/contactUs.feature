#Author: Salman
#Keywords Summary :
	
Feature: Coantact form to send USDA your info and questions
 				 I want contact USDA and be able to send my question
  				So, they recive my info and question

  
  Scenario: Succefully submit form with all info
  
    Given user is on contact us page
   	When user enters first name
   	And user enters last name
   	And user enters email
   	And enters phone numbers
   	And usre types subject of question
   	And user describes problem
   	And user clicks on submit button
   	Then Forms gets submitted
   	And validate the form submission page
     
      