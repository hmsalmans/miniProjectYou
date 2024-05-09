package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.ContactPage.*;
public class ContactClass {
	
	
	@Given("user is on contact us page")
	public void user_is_on_contact_us_page() {
		
		nav(); //navigation to the url
	   
	}

	
	
}
