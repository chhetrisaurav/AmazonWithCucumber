package in.amazon.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidCredentialsSteps extends Driver {
		
	@Given("a user is in the landing page of Amazon")
	public void a_user_is_in_the_landing_page_of_amazon() {
		//String expectedTitle = 
		
	}

	@When("he hovers the pointer over Hello, sign in")
	public void he_hovers_the_pointer_over_hello_sign_in() {
	   
	    landingPage.hoverPointerOverHelloSignInMenu();
	}

	@When("he clicks on Sign in button")
	public void he_clicks_on_sign_in_button() {
	    landingPage.clickSignIn();
	}

	@When("he enters an invalid username on phone number or email textbox")
	public void he_enters_an_invalid_username_on_phone_number_or_email_textbox() {
	 
	   signIn.enterEmail("batman445566@gmail.com");
	}

	@When("he clicks on Continue button")
	public void he_clicks_on_continue_button() {
	    signIn.clickContinueBtn();
	}

	@Then("he verifies the error message")
	public void he_verifies_the_error_message() {
		String expectedErrMsg = "We cannot find an account with that email address";
		String actualErrMsg = signIn.getErrMsg();
		
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}


}
