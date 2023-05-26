package in.amazon.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import in.amazon.pages.AllMobiles;
import in.amazon.pages.AppleMobiles;
import in.amazon.pages.BuyPhone;
import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;

public class Driver extends Tools{
	
	protected static LandingPage landingPage;
	protected static SignIn signIn;
	protected static AllMobiles allMobiles;
	protected static AppleMobiles appleMobiles;
	protected static  BuyPhone buyPhone;
	
	public static void init() {
		
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://amazon.in");
		 landingPage = new LandingPage(driver);
		 signIn = new SignIn(driver);
		 allMobiles = new AllMobiles(driver);
		 appleMobiles = new AppleMobiles(driver);
		 buyPhone = new BuyPhone(driver);
		 
		    
	}

}
