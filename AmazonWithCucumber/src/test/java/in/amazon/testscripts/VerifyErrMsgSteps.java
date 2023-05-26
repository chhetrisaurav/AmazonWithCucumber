package in.amazon.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyErrMsgSteps extends Driver{
	
	@Given("a user is on landing page")
	public void a_user_is_on_landing_page() {
	   
	}

	@When("he hovers over the Hello sign-in menu")
	public void he_hovers_over_the_hello_sign_in_menu() {
	    landingPage.hoverPointerOverHelloSignInMenu();
	}

	@When("he clicks on Sign-in button in the sub-menu")
	public void he_clicks_on_sign_in_button_in_the_sub_menu() {
	   landingPage.clickSignIn();
	}

	@When("he enters an invalid email id {string} in the email box")
	public void he_enters_an_invalid_email_id_in_the_email_box(String string) {
	   signIn.enterEmail(string);
	}

	@When("he clicks continue button")
	public void he_clicks_continue_button() {
	   signIn.clickContinueBtn();
	}

	@Then("he should see the message {string}")
	public void he_should_see_the_message(String string) {
	   String expectedErrMsg = string;
	   String actualErrMsg = signIn.getErrMsg();
	   
	   Assert.assertEquals(actualErrMsg, expectedErrMsg);
	}
	
	@When("he enters an invalid email {string} in the email box")
	public void he_enters_an_invalid_email_in_the_email_box(String string) {
	   signIn.enterEmail(string);
	}

}
