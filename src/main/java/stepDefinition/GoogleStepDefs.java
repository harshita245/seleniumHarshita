package stepDefinition;

import base.Google;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDefs {


	
	@Given("I want to launch google.com")
	public void i_want_to_launch_google_com() {
	    Google.openURL();
	}

	@When("I enter text {string}")
	public void i_enter_text(String arg1) {
	    Google.enterValue(arg1);
	}

	@Then("I click on the first link")
	public void i_click_on_the_first_link() throws InterruptedException {
	    Google.clickOnFirstLink();
	}
	
	
}
