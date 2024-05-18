package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactPage;

import static pages.ContactPage.*;
public class ContactClass {
	
	
	@Given("user is on contact us page")
	public void user_is_on_contact_us_page() throws InterruptedException {
		
		
		nav(); //navigation to the url
	   
	}
	
	@When("user enters first name")
	public void user_enters_first_name() throws InterruptedException {
		firsName();
	
	}

	@When("user enters last name")
	public void user_enters_last_name() throws InterruptedException {
		lastName();
		
	}

	@When("user enters email")
	public void user_enters_email() throws InterruptedException {
	   email();
		
	}

	@When("enters phone numbers")
	public void enters_phone_numbers() throws InterruptedException {
	  helloNum();
		
	}

	@When("usre types subject of question")
	public void usre_types_subject_of_question() throws InterruptedException {
	   subject();
		
	}

	@When("user describes problem")
	public void user_describes_problem() throws InterruptedException {
	   description();
		
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() throws InterruptedException {
	    clickbutton();
	}

	@Then("Forms gets submitted")
	public void forms_gets_submitted() {
	   
		
	}

	@Then("validate the form submission page")
	public void validate_the_form_submission_page() {
	    
		
	}




	
	
}
