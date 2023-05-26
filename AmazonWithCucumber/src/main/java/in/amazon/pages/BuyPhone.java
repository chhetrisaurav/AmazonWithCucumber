package in.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyPhone {
	
	WebDriverWait wait;
	
	
	@FindBy(id = "buy-now-button")
	private WebElement buyPhone;
	
	public BuyPhone(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
	}
	
	public void ClickBuyNowBtn() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("buy-now-button")));
		buyPhone.click();
	}

}
