package in.amazon.testscripts;

import java.util.ArrayList;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyMobilePhoneSteps extends Driver{

	
	@Given("a user is on the landing page of Amazon")
	public void a_user_is_on_the_landing_page_of_amazon() {

	}

	@When("he clicks on Mobiles")
	public void he_clicks_on_mobiles() {
	  	   landingPage.clickMobile();
	}

	@When("he hovers the pointer over Mobiles & Accessories")
	public void he_hovers_the_pointer_over_mobiles_accessories() {
		
	    allMobiles.hoverOverMobileAndAccessories();
	    
	}

	@When("he clicks on Apple")
	public void he_clicks_on_apple() {
	    allMobiles.clickApple();
	}

	@When("he clicks on the second available phone on the page")
	public void he_clicks_on_the_second_available_phone_on_the_page() {
	   
	   appleMobiles.clickSecPhone();
	}

	@When("he switches focus on new tab")
	public void he_switches_focus_on_new_tab() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}
	@When("he clicks on Buy Now button")
	public void he_clicks_on_buy_now_button() {
	  
	    buyPhone.ClickBuyNowBtn();
	}

	@Then("he should he able to buy the mobile phone sucessfully")
	public void he_should_he_able_to_buy_the_mobile_phone_sucessfully() {
		String expectedTxt = "Sign in";
		String actualTxt = signIn.getSignInText();	
		Assert.assertEquals(actualTxt, expectedTxt);
	}

}
